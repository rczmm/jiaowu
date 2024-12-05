import request from '@/utils/request'

// 查询以学期为单位，完成包含课程标准、教学计划、教案、课件等的无纸化管理及共享列表
export function listTeachingmaterials(query) {
  return request({
    url: '/system/teachingmaterials/list',
    method: 'get',
    params: query
  })
}

// 查询以学期为单位，完成包含课程标准、教学计划、教案、课件等的无纸化管理及共享详细
export function getTeachingmaterials(MaterialID) {
  return request({
    url: '/system/teachingmaterials/' + MaterialID,
    method: 'get'
  })
}

// 新增以学期为单位，完成包含课程标准、教学计划、教案、课件等的无纸化管理及共享
export function addTeachingmaterials(data) {
  return request({
    url: '/system/teachingmaterials',
    method: 'post',
    data: data
  })
}

// 修改以学期为单位，完成包含课程标准、教学计划、教案、课件等的无纸化管理及共享
export function updateTeachingmaterials(data) {
  return request({
    url: '/system/teachingmaterials',
    method: 'put',
    data: data
  })
}

// 删除以学期为单位，完成包含课程标准、教学计划、教案、课件等的无纸化管理及共享
export function delTeachingmaterials(MaterialID) {
  return request({
    url: '/system/teachingmaterials/' + MaterialID,
    method: 'delete'
  })
}
