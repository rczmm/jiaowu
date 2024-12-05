import request from '@/utils/request'

// 查询存储学生选课信息的列表
export function listEnrollments(query) {
  return request({
    url: '/system/enrollments/list',
    method: 'get',
    params: query
  })
}

// 查询存储学生选课信息的详细
export function getEnrollments(studentId) {
  return request({
    url: '/system/enrollments/' + studentId,
    method: 'get'
  })
}

// 新增存储学生选课信息的
export function addEnrollments(data) {
  return request({
    url: '/system/enrollments',
    method: 'post',
    data: data
  })
}

// 修改存储学生选课信息的
export function updateEnrollments(data) {
  return request({
    url: '/system/enrollments',
    method: 'put',
    data: data
  })
}

// 删除存储学生选课信息的
export function delEnrollments(studentId) {
  return request({
    url: '/system/enrollments/' + studentId,
    method: 'delete'
  })
}
