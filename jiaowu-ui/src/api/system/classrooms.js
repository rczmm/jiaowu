import request from '@/utils/request'

// 查询教室基础数据由教务处管理和维护列表
export function listClassrooms(query) {
  return request({
    url: '/system/classrooms/list',
    method: 'get',
    params: query
  })
}

// 查询教室基础数据由教务处管理和维护详细
export function getClassrooms(classroomID) {
  return request({
    url: '/system/classrooms/' + classroomID,
    method: 'get'
  })
}

// 新增教室基础数据由教务处管理和维护
export function addClassrooms(data) {
  return request({
    url: '/system/classrooms',
    method: 'post',
    data: data
  })
}

// 修改教室基础数据由教务处管理和维护
export function updateClassrooms(data) {
  return request({
    url: '/system/classrooms',
    method: 'put',
    data: data
  })
}

// 删除教室基础数据由教务处管理和维护
export function delClassrooms(classroomID) {
  return request({
    url: '/system/classrooms/' + classroomID,
    method: 'delete'
  })
}
