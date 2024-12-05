import request from '@/utils/request'

// 查询存储学生信息的列表
export function listStudents(query) {
  return request({
    url: '/system/students/list',
    method: 'get',
    params: query
  })
}

// 查询存储学生信息的详细
export function getStudents(studentId) {
  return request({
    url: '/system/students/' + studentId,
    method: 'get'
  })
}

// 新增存储学生信息的
export function addStudents(data) {
  return request({
    url: '/system/students',
    method: 'post',
    data: data
  })
}

// 修改存储学生信息的
export function updateStudents(data) {
  return request({
    url: '/system/students',
    method: 'put',
    data: data
  })
}

// 删除存储学生信息的
export function delStudents(studentId) {
  return request({
    url: '/system/students/' + studentId,
    method: 'delete'
  })
}
