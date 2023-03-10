# Java_Demo
Start Learn Java,go ahead！  
#20230310  
ubuntu system java17安装  
sudo apt update  
sudo apt install -y libc6-x32 libc6-i386 ##需要的dependency都要加上进行安装  
wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.deb  
sudo dpkg -i jdk-17_linux-x64_bin.deb  
sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-17/bin/java 1  
java -version  