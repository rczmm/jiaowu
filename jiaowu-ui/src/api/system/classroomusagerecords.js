import request from '@/utils/request'

// 查询追踪教室的使用情况列表
export function listClassroomusagerecords(query) {
  return request({
    url: '/system/classroomusagerecords/list',
    method: 'get',
    params: query
  })
}

// 查询追踪教室的使用情况详细
export function getClassroomusagerecords(recordID) {
  return request({
    url: '/system/classroomusagerecords/' + recordID,
    method: 'get'
  })
}

// 新增追踪教室的使用情况
export function addClassroomusagerecords(data) {
  return request({
    url: '/system/classroomusagerecords',
    method: 'post',
    data: data
  })
}

// 修改追踪教室的使用情况
export function updateClassroomusagerecords(data) {
  return request({
    url: '/system/classroomusagerecords',
    method: 'put',
    data: data
  })
}

// 删除追踪教室的使用情况
export function delClassroomusagerecords(recordID) {
  return request({
    url: '/system/classroomusagerecords/' + recordID,
    method: 'delete'
  })
}
