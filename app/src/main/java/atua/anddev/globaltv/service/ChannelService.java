package atua.anddev.globaltv.service;

import android.content.*;

import atua.anddev.globaltv.entity.*;

import java.util.*;

public interface ChannelService {
    List<Channel> channel = new ArrayList<Channel>();
    List<String> channelName = new ArrayList<String>();

    public void addToChannelList(String name, String url, String category);

    public Channel getChannelById(int id);

    public void clearAllChannel();

    public int sizeOfChannelList();

    public int indexNameForChannel(String name);

    public List<String> getCategoriesList();

    public void openChannel(String chName, Context context);

    public void openURL(final String chURL, final Context context);
}