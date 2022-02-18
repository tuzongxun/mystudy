<template>
  <div id="head">
    <div id="log">TZX生活管家</div>
    <!-- <ul id="nau">
            <li class="na0 na"><i class="el-icon-s-home ic"></i>首页</li>
            <li class="nal na"><i class="el-icon-s-custom ic"></i>人员管理</li>
            <li class="nal na"><i class="el-icon-s-order ic"></i>生日管理</li>
            <li class="nal na"><i class="el-icon-s-tools ic"></i>系统管理</li>
        </ul> -->
    <div id="search">
      <el-input
        placeholder="请输入内容"
        v-model="input3"
        class="input-with-select"
      >
        <el-button slot="append" icon="el-icon-search"></el-button>
      </el-input>
    </div>
    <div id="una">tzx[退出]</div>
  </div>
</template>
<script>
export default {
  name: "TzxHeader",
  data() {
    return {
      menu: ["首页", "分类", "日记"],
      input1: '',
      input2: '',
      input3: '',
      select: ''
    };
  },
};
</script>
<style scope>
.el-select .el-input {
    width: 130px;
    text-align: right;
}
.input-with-select .el-input-group__prepend {
    background-color: #fff;
}
#search {
  position: absolute;
  top: 0;
  left: 10.5%;
  width: 550px;
  height: 50px;
  background-color: #3c8dbc;
  line-height: 50px;
  text-align: lkeft;
}

#una {
  height: 50px;
  width: 300px;
  line-height: 50px;
  text-align: right;
  margin-right: 10px;
  background-color: #3c8dbc;
  color: rgb(78, 6, 12);
  float: right;
  font-size: 20px;
}
#una:hover {
  cursor: pointer;
}
#log {
  background-color: #073b58;
  width: 10%;
  height: 50px;
  float: left;
  line-height: 50px;
  text-align: center;
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
  color: green;
  font-size: 26px;
}
#head {
  position: absolute;
  left: 0px;
  top: 0px;
  width: 100%;
  height: 50px;
  background-color: #3c8dbc;
  /* margin-top: 5px; */
}
#nau {
  position: absolute;
  top: 0;
  left: 10%;
  list-style: none;
  width: 550px;
  height: 50px;
  background-color: #3c8dbc;
  line-height: 50px;
  text-align: right;
}
.na {
  float: left;
  height: 50px;
  background-color: #3c8dbc;
  cursor: pointer;
  font-size: 24px;
}
.na0 {
  width: 100px;
}
.nal {
  width: 140px;
}
.na:hover {
  background-color: #064a72;
}
.ic {
  background-color: #3c8dbc;
}
.ic:hover {
  background-color: #064a72;
}
</style>