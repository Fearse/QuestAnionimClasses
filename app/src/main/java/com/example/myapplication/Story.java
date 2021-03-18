package com.example.myapplication;

public class Story {
    private Situation start_situation;
    public Situation current_situation;

    Story(){
        start_situation=new Situation(2,"Вы - обычный студент, у которого сегодня учебный день. Время 9 утра и у вас сейчас дистанционная лекция. Ваши действи?","Начало");
        start_situation.choices[0]= new Situation.Variant(10,-5,-15,"(1)Пойти не лекцию, как примерный студент");
            start_situation.choices[0].situation= new Situation(2,"Вы были на лекции, и, наверное, узнали что-то новое. Но теперь вам хочется что-нибудь съесть. Что вы выберете?","Продолжение");
            start_situation.choices[0].situation.choices[0]=new Situation.Variant(0,-10,0,"(1)Конечно же дошик, т.к. мне лень что-либо готовить");
                start_situation.choices[0].situation.choices[0].situation= new Situation(2,"Вы поели, было не очень вкусно, зато быстро. Какие ваши действия теперь?","И так сойдёт");
                start_situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(30,0,-40,"(1)Пойду готовить уроки на завтра");
                    start_situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(3,"Отлично, ты подготовился к завтрашнему дню. Наступил вечер и друзья зовут тебя пойти с ними в тренажерный зал. Твои действия?","Молодец");
                    start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(25,30,-40,"(1)Конечно, пойду с ними");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(2,"Ты пришел, довольный собой т.к. ты провел очень продуктивный день(ты крут). Что будешь делать дальше?(Время уже поздно, а тебе к первой паре)","Молодец");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(0,0,+50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(0,0,+70,"(2)Лягу спать");
                            start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
                            // 1/16
                    start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(-10,-5,-15,"(2)Не пойду, буду смотреть аниме/играть в видеоигры");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation=new Situation(2,"Ну не пошел и не пошел,что бухтеть-то. Зато не устал.(Теперь тебя считают хиккой). Что будешь делать теперь?(тебе завтра к первой паре)","Уже поздно");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
                            start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");

                    start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[2]=new Situation.Variant(-15,-5,-30,"(3)Не пойду, буду учить уроки на следующие дни");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[2].situation=new Situation(2,"Ты выучил уроки на всю оставшуюся неделю, но какой ценой(тебя считают зубрилой и никуда не зовут). Что будешь делать теперь?","Чел, ты....");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
                        start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
                            start_situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
                            //Закончил 1 из 8 веток
                start_situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(-5,-5,-15,"(2)Какие уроки, еще день, пока можно и поиграть");
                    start_situation.choices[0].situation.choices[0].situation.choices[1].situation= new Situation(2,"Ты не заметил, но уже стало поздно, и если ты хотел куда-то пойти, то уже не сегодя. Что будешь делать дальше?", "Бывает");
                    start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0]= new Situation.Variant(10,-5,-20,"(1)Попробую сделать что-нибудь из уроков");
                        start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(2,"Уже довольно поздно и ты осознаешь, что не сделать всё, что нужно к завтра твои действия?","Учить или не учить?");
                        start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(15,-15,50,"(1)Продолжу учить");
                            start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(0,"Из-за того,что ты долго сидел, ты вообще не выспался, но пришел с выученными уроками, решай сам хорошо это или плохо","Утро");
                        start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-5,-5,70,"(2)Какие еще уроки, пойду конечно же спать");
                            start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты отлично поспал, хотя во сне тебя немного мучила совесть","Утро");
                    start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1]= new Situation.Variant(-10,-5,10,"(2)Пофиг на уроки, продолжу играть");
                        start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation=new Situation(2,"Ты весь день проиграл в игры и ничего не сделал на завтра. Уже поздно что-то учить, так как у тебя устала голова, что будешь делать?","Ночь");
                        start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0]=new Situation.Variant(-10,-10,50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты сидел до поздна, поэтому проспал свои пары в университете. Зато никто не узнал, что ты не сделал дз.","Утро");
                        start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1]=new Situation.Variant(-20,0,70,"(2)Пойду спать");
                            start_situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты отлично выспался, и пришел на пары по своему расписанию,но тут устроили работу на проверку дз, которую ты завалил (.","Не повзло, не повезло");
                            //ЧЕТВЕРТЬ
            start_situation.choices[0].situation.choices[1]=new Situation.Variant(0,10,-5,"(2)Я забочусь о своём здоровье, поэтому пойду приготовлю себе кашу");
                start_situation.choices[0].situation.choices[1].situation= new Situation(2,"Ты приготовил себе кашу и получилось очень вкусно. Какие ваши действия теперь?","Вкусно");
                start_situation.choices[0].situation.choices[1].situation.choices[0]=new Situation.Variant(30,0,-40,"(1)Пойду готовить уроки на завтра");
                    start_situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(3,"Отлично, ты подготовился к завтрашнему дню. Наступил вечер и друзья зовут тебя пойти с ними в тренажерный зал. Твои действия?","Молодец");
                    start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(25,30,-40,"(1)Конечно, пойду с ними");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(2,"Ты пришел, довольный собой т.к. ты провел очень продуктивный день(ты крут). Что будешь делать дальше?(Время уже поздно, а тебе к первой паре)","Молодец");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(0,0,+50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(0,0,+70,"(2)Лягу спать");
                            start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
        // 1/16
                    start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-10,-5,-15,"(2)Не пойду, буду смотреть аниме/играть в видеоигры");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation=new Situation(2,"Ну не пошел и не пошел,что бухтеть-то. Зато не устал.(Теперь тебя считают хиккой). Что будешь делать теперь?(тебе завтра к первой паре)","Уже поздно");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
                            start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");

                    start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[2]=new Situation.Variant(-15,-5,-30,"(3)Не пойду, буду учить уроки на следующие дни");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[2].situation=new Situation(2,"Ты выучил уроки на всю оставшуюся неделю, но какой ценой(тебя считают зубрилой и никуда не зовут). Что будешь делать теперь?","Чел, ты....");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
                        start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
                            start_situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
        //Закончил 1 из 8 веток
                start_situation.choices[0].situation.choices[1].situation.choices[1]=new Situation.Variant(-5,-5,-15,"(2)Какие уроки, еще день, пока можно и поиграть");
                    start_situation.choices[0].situation.choices[1].situation.choices[1].situation= new Situation(2,"Ты не заметил, но уже стало поздно, и если ты хотел куда-то пойти, то уже не сегодя. Что будешь делать дальше?", "Бывает");
                    start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0]= new Situation.Variant(10,-5,-20,"(1)Попробую сделать что-нибудь из уроков");
                        start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(2,"Уже довольно поздно и ты осознаешь, что не сделать всё, что нужно к завтра твои действия?","Учить или не учить?");
                        start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(15,-15,50,"(1)Продолжу учить");
                            start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(0,"Из-за того,что ты долго сидел, ты вообще не выспался, но пришел с выученными уроками, решай сам хорошо это или плохо","Утро");
                        start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-5,-5,70,"(2)Какие еще уроки, пойду конечно же спать");
                            start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты отлично поспал, хотя во сне тебя немного мучила совесть","Утро");
                    start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1]= new Situation.Variant(-10,-5,10,"(2)Пофиг на уроки, продолжу играть");
                        start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation=new Situation(2,"Ты весь день проиграл в игры и ничего не сделал на завтра. Уже поздно что-то учить, так как у тебя устала голова, что будешь делать?","Ночь");
                        start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0]=new Situation.Variant(-10,-10,50,"(1)Продолжу заниматься своими делами");
                            start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты сидел до поздна, поэтому проспал свои пары в университете. Зато никто не узнал, что ты не сделал дз.","Утро");
                        start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1]=new Situation.Variant(-20,0,70,"(2)Пойду спать");
                            start_situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты отлично выспался, и пришел на пары по своему расписанию,но тут устроили работу на проверку дз, которую ты завалил (.","Не повзло, не повезло");
                            //ПОЛОВИНА
        start_situation.choices[1]= new Situation.Variant(-10,0,15,"(2)Продолжить спать, так как вы вчера поздно легли");
        start_situation.choices[1].situation= new Situation(2,"Вы были на лекции, и, наверное, узнали что-то новое. Но теперь вам хочется что-нибудь съесть. Что вы выберете?","Продолжение");
        start_situation.choices[1].situation.choices[0]=new Situation.Variant(0,-10,0,"(1)Конечно же дошик, т.к. мне лень что-либо готовить");
        start_situation.choices[1].situation.choices[0].situation= new Situation(2,"Вы поели, было не очень вкусно, зато быстро. Какие ваши действия теперь?","И так сойдёт");
        start_situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(30,0,-40,"(1)Пойду готовить уроки на завтра");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(3,"Отлично, ты подготовился к завтрашнему дню. Наступил вечер и друзья зовут тебя пойти с ними в тренажерный зал. Твои действия?","Молодец");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(25,30,-40,"(1)Конечно, пойду с ними");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(2,"Ты пришел, довольный собой т.к. ты провел очень продуктивный день(ты крут). Что будешь делать дальше?(Время уже поздно, а тебе к первой паре)","Молодец");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(0,0,+50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(0,0,+70,"(2)Лягу спать");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
        // 1/16
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(-10,-5,-15,"(2)Не пойду, буду смотреть аниме/играть в видеоигры");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation=new Situation(2,"Ну не пошел и не пошел,что бухтеть-то. Зато не устал.(Теперь тебя считают хиккой). Что будешь делать теперь?(тебе завтра к первой паре)","Уже поздно");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");

        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[2]=new Situation.Variant(-15,-5,-30,"(3)Не пойду, буду учить уроки на следующие дни");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[2].situation=new Situation(2,"Ты выучил уроки на всю оставшуюся неделю, но какой ценой(тебя считают зубрилой и никуда не зовут). Что будешь делать теперь?","Чел, ты....");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
        start_situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[2].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
        //Закончил 1 из 8 веток
        start_situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-5,-5,-15,"(2)Какие уроки, еще день, пока можно и поиграть");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation= new Situation(2,"Ты не заметил, но уже стало поздно, и если ты хотел куда-то пойти, то уже не сегодя. Что будешь делать дальше?", "Бывает");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0]= new Situation.Variant(10,-5,-20,"(1)Попробую сделать что-нибудь из уроков");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(2,"Уже довольно поздно и ты осознаешь, что не сделать всё, что нужно к завтра твои действия?","Учить или не учить?");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(15,-15,50,"(1)Продолжу учить");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(0,"Из-за того,что ты долго сидел, ты вообще не выспался, но пришел с выученными уроками, решай сам хорошо это или плохо","Утро");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-5,-5,70,"(2)Какие еще уроки, пойду конечно же спать");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты отлично поспал, хотя во сне тебя немного мучила совесть","Утро");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1]= new Situation.Variant(-10,-5,10,"(2)Пофиг на уроки, продолжу играть");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation=new Situation(2,"Ты весь день проиграл в игры и ничего не сделал на завтра. Уже поздно что-то учить, так как у тебя устала голова, что будешь делать?","Ночь");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0]=new Situation.Variant(-10,-10,50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты сидел до поздна, поэтому проспал свои пары в университете. Зато никто не узнал, что ты не сделал дз.","Утро");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1]=new Situation.Variant(-20,0,70,"(2)Пойду спать");
        start_situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты отлично выспался, и пришел на пары по своему расписанию,но тут устроили работу на проверку дз, которую ты завалил (.","Не повзло, не повезло");
        //ЧЕТВЕРТЬ
        start_situation.choices[1].situation.choices[1]=new Situation.Variant(0,10,-5,"(2)Я забочусь о своём здоровье, поэтому пойду приготовлю себе кашу");
        start_situation.choices[1].situation.choices[1].situation= new Situation(2,"Ты приготовил себе кашу и получилось очень вкусно. Какие ваши действия теперь?","Вкусно");
        start_situation.choices[1].situation.choices[1].situation.choices[0]=new Situation.Variant(30,0,-40,"(1)Пойду готовить уроки на завтра");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(3,"Отлично, ты подготовился к завтрашнему дню. Наступил вечер и друзья зовут тебя пойти с ними в тренажерный зал. Твои действия?","Молодец");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(25,30,-40,"(1)Конечно, пойду с ними");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(2,"Ты пришел, довольный собой т.к. ты провел очень продуктивный день(ты крут). Что будешь делать дальше?(Время уже поздно, а тебе к первой паре)","Молодец");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0]=new Situation.Variant(0,0,+50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1]=new Situation.Variant(0,0,+70,"(2)Лягу спать");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
        // 1/16
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-10,-5,-15,"(2)Не пойду, буду смотреть аниме/играть в видеоигры");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation=new Situation(2,"Ну не пошел и не пошел,что бухтеть-то. Зато не устал.(Теперь тебя считают хиккой). Что будешь делать теперь?(тебе завтра к первой паре)","Уже поздно");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");

        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[2]=new Situation.Variant(-15,-5,-30,"(3)Не пойду, буду учить уроки на следующие дни");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[2].situation=new Situation(2,"Ты выучил уроки на всю оставшуюся неделю, но какой ценой(тебя считают зубрилой и никуда не зовут). Что будешь делать теперь?","Чел, ты....");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[0]=new Situation.Variant(0,0,50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[0].situation=new Situation(0,"Ты проспал занятия,вот чего ты добился за сутки","Ну ничего страшного");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[1]=new Situation.Variant(0,0,70,"(2)Лягу спать");
        start_situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[2].situation.choices[1].situation=new Situation(0,"Ты выспался и нормально собрался в универ,вот чего ты добился за сутки","Утро");
        //Закончил 1 из 8 веток
        start_situation.choices[1].situation.choices[1].situation.choices[1]=new Situation.Variant(-5,-5,-15,"(3)Какие уроки, еще день, пока можно и поиграть");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation= new Situation(2,"Ты не заметил, но уже стало поздно, и если ты хотел куда-то пойти, то уже не сегодя. Что будешь делать дальше?", "Бывает");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0]= new Situation.Variant(10,-5,-20,"(1)Попробую сделать что-нибудь из уроков");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(2,"Уже довольно поздно и ты осознаешь, что не сделать всё, что нужно к завтра твои действия?","Учить или не учить?");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0]=new Situation.Variant(15,-15,50,"(1)Продолжу учить");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[0].situation=new Situation(0,"Из-за того,что ты долго сидел, ты вообще не выспался, но пришел с выученными уроками, решай сам хорошо это или плохо","Утро");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1]=new Situation.Variant(-5,-5,70,"(2)Какие еще уроки, пойду конечно же спать");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation.choices[1].situation=new Situation(0,"Ты отлично поспал, хотя во сне тебя немного мучила совесть","Утро");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1]= new Situation.Variant(-10,-5,10,"(2)Пофиг на уроки, продолжу играть");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation=new Situation(2,"Ты весь день проиграл в игры и ничего не сделал на завтра. Уже поздно что-то учить, так как у тебя устала голова, что будешь делать?","Ночь");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0]=new Situation.Variant(-10,-10,50,"(1)Продолжу заниматься своими делами");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[0].situation=new Situation(0,"Ты сидел до поздна, поэтому проспал свои пары в университете. Зато никто не узнал, что ты не сделал дз.","Утро");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1]=new Situation.Variant(-20,0,70,"(2)Пойду спать");
        start_situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation.choices[1].situation=new Situation(0,"Ты отлично выспался, и пришел на пары по своему расписанию,но тут устроили работу на проверку дз, которую ты завалил (.","Не повзло, не повезло");
        current_situation=start_situation;

    }
}
