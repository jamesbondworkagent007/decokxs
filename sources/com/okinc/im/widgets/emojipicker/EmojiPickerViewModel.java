package com.okinc.im.widgets.emojipicker;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35771oDb;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class EmojiPickerViewModel extends ViewModel {
    public final List<String> AEQbTJ;
    public final C35771oDb EZpvd;
    public final MutableLiveData<List<String>> OLrzqt;
    public final LiveData<List<String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<String>> copydefault() {
        return this.copydefault;
    }

    @yCM
    public EmojiPickerViewModel(@NotNull C35771oDb c35771oDb) {
        Intrinsics.checkNotNullParameter(c35771oDb, "");
        this.EZpvd = c35771oDb;
        MutableLiveData<List<String>> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.copydefault = mutableLiveData;
        this.AEQbTJ = yDY.gEmmrt("👍", "👎", "😀", "🥲", "❤️", "🔥", "🤣", "😅", "🙂", "🙃", "😉", "😊", "🤩", "🤪", "\u1fae1", "🤫", "😏", "😒", "🤯", "🥳", "🙈", "🙊", "🙉", "👌", "✌️", "🤞", "🤙", "👍", "👎", "👏", "🙌", "\u1faf6", "💪", "🚀", "💯", "💦");
        KWHzl();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EmojiPickerViewModel$loadEmojis$1(this, null), 3, null);
    }
}
