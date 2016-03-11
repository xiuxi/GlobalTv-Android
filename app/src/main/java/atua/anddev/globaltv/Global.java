package atua.anddev.globaltv;

import atua.anddev.globaltv.service.ChannelService;
import atua.anddev.globaltv.service.ChannelServiceImpl;
import atua.anddev.globaltv.service.FavoriteService;
import atua.anddev.globaltv.service.FavoriteServiceImpl;
import atua.anddev.globaltv.service.PlaylistService;
import atua.anddev.globaltv.service.PlaylistServiceImpl;
import atua.anddev.globaltv.service.SearchService;
import atua.anddev.globaltv.service.SearchServiceImpl;

public interface Global {
    PlaylistService playlistService = new PlaylistServiceImpl();
    ChannelService channelService = new ChannelServiceImpl();
    FavoriteService favoriteService = new FavoriteServiceImpl();
    SearchService searchService = new SearchServiceImpl();
}