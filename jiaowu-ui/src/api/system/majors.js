import request from '@/utils/request'

// 查询专业基础数据由教务处管理和维护列表
export function listMajors(query) {
  return request({
    url: '/system/majors/list',
    method: 'get',
    params: query
  })
}

// 查询专业基础数据由教务处管理和维护详细
export function getMajors(MajorID) {
  return request({
    url: '/system/majors/' + MajorID,
    method: 'get'
  })
}

// 新增专业基础数据由教务处管理和维护
export function addMajors(data) {
  return request({
    url: '/system/majors',
    method: 'post',
    data: data
  })
}

// 修改专业基础数据由教务处管理和维护
export function updateMajors(data) {
  return request({
    url: '/system/majors',
    method: 'put',
    data: data
  })
}

// 删除专业基础数据由教务处管理和维护
export function delMajors(MajorID) {
  return request({
    url: '/system/majors/' + MajorID,
    method: 'delete'
  })
}
