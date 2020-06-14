package com.springinaction.knights;

public class DamselrescuingKnight  implements Knight{
    private RescueDamselQuest quest;
    public DamselrescuingKnight() {
        this.quest = new RescueDamselQuest();
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}


