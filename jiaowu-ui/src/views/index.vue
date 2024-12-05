<template>
  <div class="dashboard-container">

    <div class="carousel-image">
      <el-carousel>
        <el-carousel-item v-for="(image, index) in images" :key="index">
          <div class="grid-content bg-purple">
            <img :src="image" alt="Carousel Image" class="carousel-image"/>
          </div>
        </el-carousel-item>
      </el-carousel>
    </div>
    <div class="desc">
      <el-card class="box-card" v-for="(card, index) in cards" :key="index">
        <div slot="header" class="clearfix">
          <span>{{ card.title }}</span>
        </div>
        <div class="text item">{{ card.description }}</div>
      </el-card>
    </div>

  </div>

</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.8.8",
      // 使用 require.context 动态加载 assets 目录下的所有图片
      images: [
        require('@/assets/carousel/pexels-photo.webp'),
        require('@/assets/carousel/pexels-photo-67112.jpg'),
        require('@/assets/carousel/pexels-photo-399161.webp'),
        require('@/assets/carousel/pexels-photo-590041.jpg'),
        require('@/assets/carousel/pexels-photo-733857.webp'),
        require('@/assets/carousel/pexels-photo-1227511.jpg'),
        require('@/assets/carousel/pexels-photo-1906440.webp')
      ],
      cards: [
        {id: 1, title: '学生注册', description: '学生提供个人信息并注册系统。'},
        {id: 2, title: '课程管理', description: '教师或教务管理员添加、修改或删除课程信息。'},
        {id: 3, title: '选课流程', description: '学生浏览可用课程并提交选课请求。'},
        {id: 4, title: '成绩管理', description: '教师录入学生成绩，学生查询成绩。'}
      ]
    };
  },
  computed: {
    // 过滤出所有图片文件的路径
    filteredImages() {
      return this.images.keys().map(item => this.images(item));
    }
  },
  methods: {}
};
</script>

<style scoped lang="scss">
.grid-content {
  width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  background-repeat: repeat;
}

.carousel-image {
  width: auto; /* 或者你可以设置一个固定的宽度 */
  height: auto;
  display: block;
}
</style>

