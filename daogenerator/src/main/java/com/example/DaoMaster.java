package com.example;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Property;
import org.greenrobot.greendao.generator.Schema;

public class DaoMaster {
    public static void main(String[] args) {

        Schema schema = new Schema(1, "com.ganhuo.entity");
        addGanhuo(schema);
        schema.setDefaultJavaPackageDao("com.ganhuo.dao");
        try {
            new DaoGenerator().generateAll(schema,"C:\\Users\\123\\AndroidStudioProjects\\EasyApplication\\app\\src\\main\\java-gen");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void addGanhuo(Schema schema) {
        Entity entity = schema.addEntity("Ganhuo");
        entity.addIdProperty();//主键 Long类型
        entity.addStringProperty("createdAt");
        entity.addStringProperty("desc");
        entity.addStringProperty("publishedAt");
        entity.addStringProperty("source");
        Property p=entity.addStringProperty("type").getProperty();
        entity.addStringProperty("url");
        entity.addBooleanProperty("used");
        entity.addStringProperty("who");

//        Entity entity1=schema.addEntity("huazai");
//
//        entity.addToOne(entity1,p);
//        entity1.addStringProperty("type");
//        entity1.addIdProperty();

    }
}
