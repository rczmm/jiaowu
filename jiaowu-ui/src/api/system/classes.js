import request from '@/utils/request'

// 查询存储班级信息的列表
export function listClasses(query) {
  return request({
    url: '/system/classes/list',
    method: 'get',
    params: query
  })
}

// 查询存储班级信息的详细
export function getClasses(classId) {
  return request({
    url: '/system/classes/' + classId,
    method: 'get'
  })
}

// 新增存储班级信息的
export function addClasses(data) {
  return request({
    url: '/system/classes',
    method: 'post',
    data: data
  })
}

// 修改存储班级信息的
export function updateClasses(data) {
  return request({
    url: '/system/classes',
    method: 'put',
    data: data
  })
}

// 删除存储班级信息的
export function delClasses(classId) {
  return request({
    url: '/system/classes/' + classId,
    method: 'delete'
  })
}
