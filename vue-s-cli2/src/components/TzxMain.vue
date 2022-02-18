<template>
  <div id="ma">
    <el-table
      :data="dataList"
      style="width: 100%"
      :row-class-name="tableRowClassName"
    >
      <el-table-column prop="username" label="姓名" width="180"> </el-table-column>
      <el-table-column prop="age" label="年龄" width="180"> </el-table-column>
      <el-table-column prop="phone" label="电话"> </el-table-column>
    </el-table>
  </div>
</template>
<script>
export default {
  name: "TzxMain",
  data() {
    return {
      dataList: [
        { "username": "涂宗勋", "age": 31, "phone": "13535353333" },
        { "username": "张三", "age": 35, "phone": "13535352222" },
        { "username": "李四", "age": 20, "phone": "13535352221" },
        { "username": "王五", "age": 40, "phone": "17535352221" }
      ],
    };
  },
  methods: {
      tableRowClassName({row, rowIndex}) {
        if (rowIndex === 1) {
          return 'warning-row';
        } else if (rowIndex === 3) {
          return 'success-row';
        }
        return '';
      }
    }
};
</script>
<style>
#ma {
  position: absolute;
  top: 50px;
  left: 10.5%;
  width: 88.5%;
  height: 100%;
  /* background-color: rgb(0, 255, 106); */
  /* margin-top: 10px; */
  margin-left: 5px;
}

.el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }
</style>