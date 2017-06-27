package syaiful.learn.chat.adapter;

import android.view.View;

/**
 * Created by syaiful9508 on 16/06/17.
 */

public interface ClickListenerChatFirebase {

    /**
     * Quando houver click na imagem do chat
     * @param view
     * @param position
     */

    void clickImageMapChat(View view, int position,String latitude,String longitude);

    /**
     * Quando houver click na imagem de mapa
     * @param view
     * @param position
     */

    void clickImageChat(View view, int position,String nameUser,String urlPhotoUser,String urlPhotoClick);

}
