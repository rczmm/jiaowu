import request from '@/utils/request'

// 查询存储教师信息的列表
export function listTeachers(query) {
  return request({
    url: '/system/teachers/list',
    method: 'get',
    params: query
  })
}

// 查询存储教师信息的详细
export function getTeachers(teacherId) {
  return request({
    url: '/system/teachers/' + teacherId,
    method: 'get'
  })
}

// 新增存储教师信息的
export function addTeachers(data) {
  return request({
    url: '/system/teachers',
    method: 'post',
    data: data
  })
}

// 修改存储教师信息的
export function updateTeachers(data) {
  return request({
    url: '/system/teachers',
    method: 'put',
    data: data
  })
}

// 删除存储教师信息的
export function delTeachers(teacherId) {
  return request({
    url: '/system/teachers/' + teacherId,
    method: 'delete'
  })
}
