## Lana's Gradle Template
### Lana's Default Template for SpringMvc

How To Use:
1. Clone 
2. Delete .git folder 
3. Rename folder
4. Rename rootProject name in settings.gradle
5. Build project

Remember To:
1. Re config files in configuration package (SpringDataJPA)
2. Create package: 
   - controllers (Servlet Dispatcher config)
   - repository (Spring JPA config)
   - model  (Spring JPA config)
   - service


Default Configuration:
* Static Resources: /assets/**
* Messages Resources: /resources/messages.properties
* Views: /WEB-INF/views/
* Default Schema: mySchema (mySQL 5.7)



To remove a config class: remove the class file and .class in ApplicationInit.