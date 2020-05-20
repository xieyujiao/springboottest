<template>
    <div>
        <table>
            <tr>
                <td>编号</td>
                <td>图书名称</td>
                <td>作者</td>
            </tr>
            <tr v-for="item in books">
                <td>{{item.id}}</td>
                <td>{{item.name}}</td>
                <td>{{item.author}}</td>
            </tr>
        </table>
    </div>

</template>

<script>
    export default {
        name: "Book",
        data(){
            return {
            //定义的json数据
              msg:'Hello Vue',
              books:[
                  {
                      id:1,
                      name:'theo',
                      author:'贝贝'
                  },
                  {
                      id:2,
                      name:'justin',
                      author:'富贵'
                  },
                  {
                      id:3,
                      name:'bill',
                      author:'雯珺'
                  },
              ]
            }
        },
        created() {
            const _this=this
            axios.get('http://localhost:8181/book/findAll').then(function(resp){
                _this.books=resp.data
            })
        }
    }
</script>

<style scoped>

</style>