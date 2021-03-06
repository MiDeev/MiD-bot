package ru.mideev.midbot.command.util;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import ru.mideev.midbot.util.UtilLang;

import java.awt.*;
import java.util.Locale;

public class Rules extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        if (event.getChannel().getId().equals("941321405172162611") && event.getMessage().getContentDisplay().toLowerCase(Locale.ROOT).equals(UtilLang.PREFIX + "rules")) {

            EmbedBuilder emba = new EmbedBuilder();
            emba.setColor(new Color(255, 98, 98));

            emba.setDescription("**Правила сервера, обязательные к прочтению:**\n" +
                    "\n" +
                    "            **__Пункт №1. Общение__**\n" +
                    "            \n" +
                    "            `1.1` Злоупотребление матом ЗАПРЕЩЕНО.\n" +
                    "            \n" +
                    "            `1.2` Оскорбление и провоцирование на агрессию ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `1.3` Флуд от 5-ти сообщений подряд вне канала <#941458443749978122> ЗАПРЕЩЕН.\n" +
                    "            \n" +
                    "            `1.4` Реклама чего-либо в любом виде и прочий спам ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `1.5` Шутки на темы национальности, семьи, политики ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `1.6` 18+ и шок-контент в любом виде на сервере ЗАПРЕЩЁН.");
            event.getGuild().getTextChannels().stream().filter(textChannel -> textChannel.getId().equals("941321405172162611"))
                    .forEach(textChannel -> textChannel.sendMessageEmbeds(emba.build()).queue());

            EmbedBuilder emba1 = new EmbedBuilder();
            emba1.setColor(new Color(255, 98, 98));

            emba1.setDescription("**__Пункт №2. Основное__**\n" +
                    "\n" +
                    "            `2.1` Всякие попытки помешать чьему-либо общению на сервере ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `2.2` Нацистская символика и порнография в аватарках,\n" +
                    "            а также нецензурные ники на сервере ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `2.3` Выдача себя за администрацию или кого-либо из участников\n" +
                    "            ЗАПРЕЩЕНА.\n" +
                    "            \n" +
                    "            `2.4` Попытки так или иначе навредить серверу ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `2.5` Торговля чего-либо в любом виде на сервере категорически ЗАПРЕЩЕНА.\n" +
                    "            \n" +
                    "            `2.6` Говорить дезинформацию о чём-либо, касаемо сервера\n" +
                    "            или участников сервера ЗАПРЕЩЕНО.");
            event.getGuild().getTextChannels().stream().filter(textChannel -> textChannel.getId().equals("941321405172162611"))
                    .forEach(textChannel -> textChannel.sendMessageEmbeds(emba1.build()).queue());

            EmbedBuilder emba2 = new EmbedBuilder();
            emba2.setColor(new Color(255, 98, 98));

            emba2.setDescription("**__Пункт №3. Голосовой чат__**\n" +
                    "\n" +
                    "            `3.1` Кричать, издавать помехи и прочие звуки мешающие нормальному общению ЗАПРЕЩЕНО.\n" +
                    "            \n" +
                    "            `3.2` Частые перезаходы в голосовые каналы ЗАПРЕЩЕНЫ.\n" +
                    "            \n" +
                    "            `3.3` Оскорбления, провоцирование на агрессию и реклама ЗАПРЕЩЕНЫ.");
            event.getGuild().getTextChannels().stream().filter(textChannel -> textChannel.getId().equals("941321405172162611"))
                    .forEach(textChannel -> textChannel.sendMessageEmbeds(emba2.build()).queue());

            EmbedBuilder emba3 = new EmbedBuilder();
            emba3.setColor(new Color(255, 98, 98));

            emba3.setDescription("**__Пункт №4. Действия__**\n" +
                    "\n" +
                    "            `4.1` Использование багов, недоработок и прочих обходов вышеописанных правил ЗАПРЕЩЕНО.\n" +
                    "            \n" +
                    "            `4.2` Всякие обходы наказаний за нарушение того или иного правила ЗАПРЕЩЕНЫ.");
            event.getGuild().getTextChannels().stream().filter(textChannel -> textChannel.getId().equals("941321405172162611"))
                    .forEach(textChannel -> textChannel.sendMessageEmbeds(emba3.build()).queue());

            EmbedBuilder emba4 = new EmbedBuilder();
            emba4.setColor(new Color(255, 98, 98));

            emba4.setDescription("**__Пункт №5. Общее__**\n" +
                    "\n" +
                    "            `5.1` Находясь на данном сервере,\n" +
                    "            Вы автоматически подтверждаете своё согласие\n" +
                    "            с вышеперечисленным перечнем правил,\n" +
                    "            вне зависимости от их прочтения.\n" +
                    "            \n" +
                    "            `5.2` Провоцирование кого-либо на любое действие,\n" +
                    "            нарушающее вышеописанные правила ЗАПРЕЩЕНО.\n" +
                    "            \n" +
                    "            `5.3` Находясь на этом сервере,\n" +
                    "            вне зависимости от имеющийся у Вас на данный момент роли -\n" +
                    "            Вы соглашаетесь с условиями NDA:\n" +
                    "            Соглашение о неразглашении конфиденциальной информации\n" +
                    "            полученной от кого-либо, находящегося на этом сервере.\n" +
                    "            \n" +
                    "            `5.4` Администраторы этого сервера вправе выносить наказания,\n" +
                    "            если на это есть причина, не согласованная с данным сводом правил.\n" +
                    "            \n" +
                    "            `5.5` Если Вы считаете, что получили несправедливое наказание,\n" +
                    "            просим сообщить об этом <@421259943123877888>.");
            event.getGuild().getTextChannels().stream().filter(textChannel -> textChannel.getId().equals("941321405172162611"))
                    .forEach(textChannel -> textChannel.sendMessageEmbeds(emba4.build()).queue());

            event.getGuild().getTextChannels().stream().filter(textChannel -> textChannel.getId().equals("941321405172162611"))
                    .forEach(textChannel -> textChannel.sendMessage("```diff\n-незнание правил не освождает от ответственности-\n```").queue());

            if (event.getMessage().getContentDisplay().contains("https://discord.gg")) {
                event.getMessage().delete().queue();
            }
        }
    }
}