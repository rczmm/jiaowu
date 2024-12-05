import request from '@/utils/request'

// 查询系部信息由组织人事部管理和维护列表
export function listDepartments(query) {
  return request({
    url: '/system/departments/list',
    method: 'get',
    params: query
  })
}

// 查询系部信息由组织人事部管理和维护详细
export function getDepartments(departmentID) {
  return request({
    url: '/system/departments/' + departmentID,
    method: 'get'
  })
}

// 新增系部信息由组织人事部管理和维护
export function addDepartments(data) {
  return request({
    url: '/system/departments',
    method: 'post',
    data: data
  })
}

// 修改系部信息由组织人事部管理和维护
export function updateDepartments(data) {
  return request({
    url: '/system/departments',
    method: 'put',
    data: data
  })
}

// 删除系部信息由组织人事部管理和维护
export function delDepartments(departmentID) {
  return request({
    url: '/system/departments/' + departmentID,
    method: 'delete'
  })
}
