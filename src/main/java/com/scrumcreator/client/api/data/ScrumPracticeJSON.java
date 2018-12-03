package com.scrumcreator.client.api.data;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScrumPracticeJSON {

    private List<ScrumPractice> practiceList;

    public ScrumPracticeJSON(List<ScrumPractice> practiceList) {
        Collections.sort(practiceList, Comparator.comparing(ScrumPractice::getPracticeIndex));
        this.practiceList = practiceList;
    }

    public List<ScrumPractice> getPracticeList() {
        return practiceList;
    }

    public void setPracticeList(List<ScrumPractice> practiceList) {
        this.practiceList = practiceList;
    }
}
