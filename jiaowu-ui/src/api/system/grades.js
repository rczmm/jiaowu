import request from '@/utils/request'

// 查询存储学生成绩信息的列表
export function listGrades(query) {
  return request({
    url: '/system/grades/list',
    method: 'get',
    params: query
  })
}

// 查询存储学生成绩信息的详细
export function getGrades(studentId) {
  return request({
    url: '/system/grades/' + studentId,
    method: 'get'
  })
}

// 新增存储学生成绩信息的
export function addGrades(data) {
  return request({
    url: '/system/grades',
    method: 'post',
    data: data
  })
}

// 修改存储学生成绩信息的
export function updateGrades(data) {
  return request({
    url: '/system/grades',
    method: 'put',
    data: data
  })
}

// 删除存储学生成绩信息的
export function delGrades(studentId) {
  return request({
    url: '/system/grades/' + studentId,
    method: 'delete'
  })
}
