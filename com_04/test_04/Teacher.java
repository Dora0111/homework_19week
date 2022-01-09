package com.com_04.test_04;

public class Teacher {
    public void checkScore(int score) throws ScoreExcrption {
        if (score < 0 || score > 100) {
            throw new ScoreExcrption("你给的分数有我，分数应该在0-100之间");
        } else {
            System.out.println("分数正常");
        }
    }
}
