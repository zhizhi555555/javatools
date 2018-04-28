## docker 安装出现的问题

###　centos是6.5　安装 docker报错　

//这两天学习docker，安装docker时报错信息如下，再网上没有找到结果，后经过多次尝试，问题出在  
//yum 原上。我的centos是6.5而我用了centos 7 的yum原。  

```
[root@centos50g docker-training]# yum install docker-engine  
Loaded plugins: fastestmirror  
Setting up Install Process  
Loading mirror speeds from cached hostfile  
 * base: mirrors.btte.net  
 * elrepo: mirrors.tuna.tsinghua.edu.cn  
 * extras: mirrors.btte.net  
 * updates: mirrors.zju.edu.cn  
Resolving Dependencies  
--> Running transaction check  
---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: docker-engine-selinux >= 1.12.3-1.el7.centos for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libcgroup for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: xz for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Running transaction check  
---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
--> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
--> Processing Dependency: policycoreutils-python for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
---> Package libcgroup.x86_64 0:0.40.rc1-18.el6_8 will be installed  
---> Package xz.x86_64 0:4.999.9-0.5.beta.20091007git.el6 will be installed  
--> Running transaction check  
---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
--> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
---> Package policycoreutils-python.x86_64 0:2.0.83-30.1.el6_8 will be installed  
--> Processing Dependency: libsemanage-python >= 2.0.43-4 for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
--> Processing Dependency: audit-libs-python >= 1.4.2-1 for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
--> Processing Dependency: setools-libs-python for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
--> Processing Dependency: libselinux-python for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
--> Running transaction check  
---> Package audit-libs-python.x86_64 0:2.4.5-3.el6 will be installed  
---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
--> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
---> Package libselinux-python.x86_64 0:2.0.94-7.el6 will be installed  
---> Package libsemanage-python.x86_64 0:2.0.43-5.1.el6 will be installed  
---> Package setools-libs-python.x86_64 0:3.3.7-4.el6 will be installed  
--> Processing Dependency: setools-libs = 3.3.7-4.el6 for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libsefs.so.4(VERS_4.0)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libseaudit.so.4(VERS_4.2)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libseaudit.so.4(VERS_4.1)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libqpol.so.1(VERS_1.4)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libqpol.so.1(VERS_1.3)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libqpol.so.1(VERS_1.2)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libpoldiff.so.1(VERS_1.3)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libpoldiff.so.1(VERS_1.2)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libapol.so.4(VERS_4.1)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libapol.so.4(VERS_4.0)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libsefs.so.4()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libseaudit.so.4()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libqpol.so.1()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libpoldiff.so.1()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Processing Dependency: libapol.so.4()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
--> Running transaction check  
---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
--> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
--> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
--> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
---> Package setools-libs.x86_64 0:3.3.7-4.el6 will be installed  
--> Finished Dependency Resolution  
Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
           Requires: selinux-policy >= 3.13.1-23  
           Installed: selinux-policy-3.7.19-292.el6_8.2.noarch (@updates)  
               selinux-policy = 3.7.19-292.el6_8.2  
           Available: selinux-policy-3.7.19-292.el6.noarch (base)  
               selinux-policy = 3.7.19-292.el6  
Error: Package: docker-engine-selinux-1.12.3-1.el7.centos.noarch (dockerrepo)  
           Requires: selinux-policy-targeted >= 3.13.1-23  
           Installed: selinux-policy-targeted-3.7.19-292.el6_8.2.noarch (@updates)  
               selinux-policy-targeted = 3.7.19-292.el6_8.2  
           Available: selinux-policy-targeted-3.7.19-292.el6.noarch (base)  
               selinux-policy-targeted = 3.7.19-292.el6  
Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
           Requires: libsystemd.so.0(LIBSYSTEMD_209)(64bit)  
Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
           Requires: libsystemd.so.0()(64bit)  
Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
           Requires: libc.so.6(GLIBC_2.17)(64bit)  
Error: Package: docker-engine-selinux-1.12.3-1.el7.centos.noarch (dockerrepo)  
           Requires: selinux-policy-base >= 3.13.1-23  
           Installed: selinux-policy-targeted-3.7.19-292.el6_8.2.noarch (@updates)  
               selinux-policy-base = 3.7.19-292.el6_8.2  
           Available: selinux-policy-minimum-3.7.19-292.el6.noarch (base)  
               selinux-policy-base = 3.7.19-292.el6  
           Available: selinux-policy-minimum-3.7.19-292.el6_8.2.noarch (updates)  
               selinux-policy-base = 3.7.19-292.el6_8.2  
           Available: selinux-policy-mls-3.7.19-292.el6.noarch (base)  
               selinux-policy-base = 3.7.19-292.el6  
           Available: selinux-policy-mls-3.7.19-292.el6_8.2.noarch (updates)  
               selinux-policy-base = 3.7.19-292.el6_8.2  
           Available: selinux-policy-targeted-3.7.19-292.el6.noarch (base)  
               selinux-policy-base = 3.7.19-292.el6  
Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
           Requires: systemd-units  
Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
           Requires: libseccomp.so.2()(64bit)  
 You could try using --skip-broken to work around the problem  
 You could try running: rpm -Va --nofiles --nodigest  
```

解决此问题的方法目前我想到了两种
1、升级centos至7
2、将yum原改成centos6的原
2.1、我原来用的yum原

```
[root@centos50g docker-training]# cat /etc/yum.repos.d/docker.repo   
[dockerrepo]  
name=Docker Repository  
baseurl=https://yum.dockerproject.org/repo/main/centos/7/  
enabled=1  
gpgcheck=1  
gpgkey=https://yum.dockerproject.org/gpg  
```

2.2、修改后的yum原

```
[root@centos50g docker-training]# cat /etc/yum.repos.d/docker.repo   
[dockerrepo]  
name=Docker Repository  
baseurl=https://yum.dockerproject.org/repo/main/centos/6/  
enabled=1  
gpgcheck=1  
gpgkey=https://yum.dockerproject.org/gpg 
```

 2.3、清除yum缓存
 
 ```
 [root@centos50g docker-training]# yum clean all  
 [root@centos50g docker-training]# yum makecache  
 ```
  2.4、再次安装docker
  
  ```
  [root@centos50g docker-training]# yum install docker-engine
  ```
  
   此时便可安装成功，但是，安装后的docker的版本是1.7.1的
   如果想要使用新的版本，需先升级centos至7后，再升级docker
   
   ```
   //这两天学习docker，安装docker时报错信息如下，再网上没有找到结果，后经过多次尝试，问题出在  
   //yum 原上。我的centos是6.5而我用了centos 7 的yum原。  
   [root@centos50g docker-training]# yum install docker-engine  
   Loaded plugins: fastestmirror  
   Setting up Install Process  
   Loading mirror speeds from cached hostfile  
    * base: mirrors.btte.net  
    * elrepo: mirrors.tuna.tsinghua.edu.cn  
    * extras: mirrors.btte.net  
    * updates: mirrors.zju.edu.cn  
   Resolving Dependencies  
   --> Running transaction check  
   ---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: docker-engine-selinux >= 1.12.3-1.el7.centos for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libcgroup for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: xz for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Running transaction check  
   ---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   ---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   --> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   --> Processing Dependency: policycoreutils-python for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   ---> Package libcgroup.x86_64 0:0.40.rc1-18.el6_8 will be installed  
   ---> Package xz.x86_64 0:4.999.9-0.5.beta.20091007git.el6 will be installed  
   --> Running transaction check  
   ---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   ---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   --> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   ---> Package policycoreutils-python.x86_64 0:2.0.83-30.1.el6_8 will be installed  
   --> Processing Dependency: libsemanage-python >= 2.0.43-4 for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
   --> Processing Dependency: audit-libs-python >= 1.4.2-1 for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
   --> Processing Dependency: setools-libs-python for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
   --> Processing Dependency: libselinux-python for package: policycoreutils-python-2.0.83-30.1.el6_8.x86_64  
   --> Running transaction check  
   ---> Package audit-libs-python.x86_64 0:2.4.5-3.el6 will be installed  
   ---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   ---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   --> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   ---> Package libselinux-python.x86_64 0:2.0.94-7.el6 will be installed  
   ---> Package libsemanage-python.x86_64 0:2.0.43-5.1.el6 will be installed  
   ---> Package setools-libs-python.x86_64 0:3.3.7-4.el6 will be installed  
   --> Processing Dependency: setools-libs = 3.3.7-4.el6 for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libsefs.so.4(VERS_4.0)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libseaudit.so.4(VERS_4.2)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libseaudit.so.4(VERS_4.1)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libqpol.so.1(VERS_1.4)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libqpol.so.1(VERS_1.3)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libqpol.so.1(VERS_1.2)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libpoldiff.so.1(VERS_1.3)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libpoldiff.so.1(VERS_1.2)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libapol.so.4(VERS_4.1)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libapol.so.4(VERS_4.0)(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libsefs.so.4()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libseaudit.so.4()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libqpol.so.1()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libpoldiff.so.1()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Processing Dependency: libapol.so.4()(64bit) for package: setools-libs-python-3.3.7-4.el6.x86_64  
   --> Running transaction check  
   ---> Package docker-engine.x86_64 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy >= 3.13.1-23 for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0(LIBSYSTEMD_209)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: systemd-units for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libc.so.6(GLIBC_2.17)(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libseccomp.so.2()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   --> Processing Dependency: libsystemd.so.0()(64bit) for package: docker-engine-1.12.3-1.el7.centos.x86_64  
   ---> Package docker-engine-selinux.noarch 0:1.12.3-1.el7.centos will be installed  
   --> Processing Dependency: selinux-policy-base >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   --> Processing Dependency: selinux-policy-targeted >= 3.13.1-23 for package: docker-engine-selinux-1.12.3-1.el7.centos.noarch  
   ---> Package setools-libs.x86_64 0:3.3.7-4.el6 will be installed  
   --> Finished Dependency Resolution  
   Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
              Requires: selinux-policy >= 3.13.1-23  
              Installed: selinux-policy-3.7.19-292.el6_8.2.noarch (@updates)  
                  selinux-policy = 3.7.19-292.el6_8.2  
              Available: selinux-policy-3.7.19-292.el6.noarch (base)  
                  selinux-policy = 3.7.19-292.el6  
   Error: Package: docker-engine-selinux-1.12.3-1.el7.centos.noarch (dockerrepo)  
              Requires: selinux-policy-targeted >= 3.13.1-23  
              Installed: selinux-policy-targeted-3.7.19-292.el6_8.2.noarch (@updates)  
                  selinux-policy-targeted = 3.7.19-292.el6_8.2  
              Available: selinux-policy-targeted-3.7.19-292.el6.noarch (base)  
                  selinux-policy-targeted = 3.7.19-292.el6  
   Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
              Requires: libsystemd.so.0(LIBSYSTEMD_209)(64bit)  
   Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
              Requires: libsystemd.so.0()(64bit)  
   Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
              Requires: libc.so.6(GLIBC_2.17)(64bit)  
   Error: Package: docker-engine-selinux-1.12.3-1.el7.centos.noarch (dockerrepo)  
              Requires: selinux-policy-base >= 3.13.1-23  
              Installed: selinux-policy-targeted-3.7.19-292.el6_8.2.noarch (@updates)  
                  selinux-policy-base = 3.7.19-292.el6_8.2  
              Available: selinux-policy-minimum-3.7.19-292.el6.noarch (base)  
                  selinux-policy-base = 3.7.19-292.el6  
              Available: selinux-policy-minimum-3.7.19-292.el6_8.2.noarch (updates)  
                  selinux-policy-base = 3.7.19-292.el6_8.2  
              Available: selinux-policy-mls-3.7.19-292.el6.noarch (base)  
                  selinux-policy-base = 3.7.19-292.el6  
              Available: selinux-policy-mls-3.7.19-292.el6_8.2.noarch (updates)  
                  selinux-policy-base = 3.7.19-292.el6_8.2  
              Available: selinux-policy-targeted-3.7.19-292.el6.noarch (base)  
                  selinux-policy-base = 3.7.19-292.el6  
   Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
              Requires: systemd-units  
   Error: Package: docker-engine-1.12.3-1.el7.centos.x86_64 (dockerrepo)  
              Requires: libseccomp.so.2()(64bit)  
    You could try using --skip-broken to work around the problem  
    You could try running: rpm -Va --nofiles --nodigest  
  ```  
    
  解决此问题的方法目前我想到了两种
    1、升级centos至7
    2、将yum原改成centos6的原
    2.1、我原来用的yum原
  
  ```
  [root@centos50g docker-training]# cat /etc/yum.repos.d/docker.repo   
  [dockerrepo]  
  name=Docker Repository  
  baseurl=https://yum.dockerproject.org/repo/main/centos/7/  
  enabled=1  
  gpgcheck=1  
  gpgkey=https://yum.dockerproject.org/gpg  
  ```
  
  2.2、修改后的yum原
  
  ```
  [root@centos50g docker-training]# cat /etc/yum.repos.d/docker.repo   
  [dockerrepo]  
  name=Docker Repository  
  baseurl=https://yum.dockerproject.org/repo/main/centos/6/  
  enabled=1  
  gpgcheck=1  
  gpgkey=https://yum.dockerproject.org/gpg  
  ```
  
   2.3、清除yum缓存
   
   ```
   [root@centos50g docker-training]# yum clean all  
   [root@centos50g docker-training]# yum makecache  
   ```
   
  2.4、再次安装docker
  ```
  [root@centos50g docker-training]# yum install docker-engine  
  ```
   此时便可安装成功，但是，安装后的docker的版本是1.7.1的
   如果想要使用新的版本，需先升级centos至7后，再升级docker  
