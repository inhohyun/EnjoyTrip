const { defineConfig } = require('@vue/cli-service');

module.exports = defineConfig({
  transpileDependencies: true,
  pages: {
    index: {
      entry: 'src/main.js', // 메인 진입점 파일
      template: 'public/index.html', // HTML 템플릿 파일
      filename: 'index.html', // 출력 파일 이름
      title: 'EnjoyTrip', 
    }
  }
})
