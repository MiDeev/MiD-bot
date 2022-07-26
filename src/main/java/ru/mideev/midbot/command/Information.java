package ru.mideev.midbot.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import ru.mideev.midbot.util.UtilLang;

import java.awt.*;
import java.util.Locale;

public class Information extends ListenerAdapter {
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        EmbedBuilder si = new EmbedBuilder();

        if (event.getChannel().getId().equals("941322004060073985") && event.getMessage().getContentDisplay().toLowerCase(Locale.ROOT).equals(UtilLang.PREFIX + "info")) {
            si.setColor(new Color(127, 138, 254));
            si.setAuthor("ОПИСАНИЕ КАНАЛОВ:", null, "https://cdn-icons-png.flaticon.com/64/6517/6517896.png");

            si.setDescription(
                    "<#988419768757420063>  - правила сервера.\n" +
                            "<#950750830833852446> - новости этого Discord-сервера.\n" +
                            "<#941364846899900496> - новости YouTube-канала.\n" +
                            "<#983318878258081813> - канал для получения ролей.\n" +
                            "\n" +
                            "<#941334996654911488> - основной чат для общения.\n" +
                            "<#941458443749978122> - чат для команд и прочего флуда.\n" +
                            "<#988553193933918319> - дискуссии на игровые тематики.\n" +
                            "<#988556235588661249> - канал для творчества.\n" +
                            "\n" +
                            "<#979498476452859994> - предлагайте свои дс-идеи здесь.\n" +
                            "<#985623622293028935> - советы по изменениям сервера.\n" +
                            "<#988555247888785438> - здесь можно пожаловаться.");
            event.getMessage().getChannel().asTextChannel().sendMessageEmbeds(si.build()).queue();
        }

        if (event.getChannel().getId().equals("941322004060073985") && event.getMessage().getContentDisplay().equals(".info")) {
            si.setColor(new Color(255, 148, 79));
            si.setAuthor("ОПИСАНИЕ РОЛЕЙ:", null, "https://cdn.discordapp.com/attachments/942520425936719952/975780927236100146/-_1.png");

            si.setDescription(
                    "<@&942440874690871316> - **главный господин сервера, он же <@421259943123877888>**.\n" +
                            "\n" +
                            "<@&975747225500123152> - **управляет и сопровождает сервер.**\n" +
                            "*Люди с данной ролью отвечают за персонал и порядок.*\n" +
                            "<@&975748559838281798> - **помогает с вопросами, касательно сервера.**\n" +
                            "*По вопросам пишите им в ЛС или упоминайте людей с этой ролью.*\n" +
                            "<@&975748559473344532> - **контролирует чат и наказывает нарушителей.**\n" +
                            "*Увидев нарушение, пингуйте роль или пишите им в ЛС.*\n" +
                            "\n" +
                            "<@&975750629425315862> - **что-то кодит и как-то помогает этим серверу.**\n" +
                            "*Являетесь разработчиком и готовы помочь с помощью кода?*\n" +
                            "*Тогда **пишите** в **ЛС*** к <@&975747225500123152>*, **вам всё расскажут***.\n" +
                            "\n" +
                            "<@&943220825753022525> - **бустер сервера, имеющий права как у <@&975318500648304650>.**\n" +
                            "*Каждый буст расширяет возможности сервера и даёт плюшки бустерам.*\n" +
                            "\n" +
                            "<@&975322744050831390> - **даёт права к просмотру журнала аудита, и...**\n" +
                            "*Выдаётся при достижении **100**-го уровня.*\n" +
                            "<@&975318487448834088> - **предоставляет возможность создавать ветки.**\n" +
                            "*Выдаётся при достижении **75**-го уровня.*\n" +
                            "<@&975318500648304650> - **разрешает создавать свои приватные каналы.**\n" +
                            "*Выдаётся при достижении **50**-го уровня.*\n" +
                            "<@&975318511549300776> - **имеет в себе возможность встраивать ссылки.**\n" +
                            "*Выдаётся при достижении **30**-го уровня.*\n" +
                            "<@&975474836782587945> - **даёт возможность изменять ник.**\n" +
                            "*Выдаётся при достижении **15**-го уровня.*\n" +
                            "<@&975837708972855326> - **позволяет заходить в приватные каналы.**\n" +
                            "*Выдаётся при достижении **10**-го уровня.*\n" +
                            "<@&975518433821212692> - **может прикреплять изображения к своим сообщениям.**\n" +
                            "*Выдаётся при достижении **5**-го уровня.*");
            event.getMessage().getChannel().asTextChannel().sendMessageEmbeds(si.build()).queue();
        }
    }
}
