import request from '@/utils/request'

// 查询存储课程信息的列表
export function listCourses(query) {
  return request({
    url: '/system/courses/list',
    method: 'get',
    params: query
  })
}

// 查询存储课程信息的详细
export function getCourses(courseId) {
  return request({
    url: '/system/courses/' + courseId,
    method: 'get'
  })
}

// 新增存储课程信息的
export function addCourses(data) {
  return request({
    url: '/system/courses',
    method: 'post',
    data: data
  })
}

// 修改存储课程信息的
export function updateCourses(data) {
  return request({
    url: '/system/courses',
    method: 'put',
    data: data
  })
}

// 删除存储课程信息的
export function delCourses(courseId) {
  return request({
    url: '/system/courses/' + courseId,
    method: 'delete'
  })
}
