package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36404oaN {
    public static WeakReference<C36403oaM> KWHzl;
    public static java.util.List<C36407oaQ> copydefault;
    public static final C36404oaN EZpvd = new C36404oaN();
    public static final WeakHashMap<android.widget.EditText, C36403oaM> AEQbTJ = new WeakHashMap<>();
    public static final int OLrzqt = 8;

    private C36404oaN() {
    }

    public final void AEQbTJ(@NotNull android.widget.EditText editText, @NotNull C36403oaM c36403oaM) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(c36403oaM, "");
        pUU.KWHzl("MentionInputHandlerRegistry", "register: editText=" + editText.hashCode() + ", handler=" + c36403oaM.hashCode());
        AEQbTJ.put(editText, c36403oaM);
        KWHzl = new WeakReference<>(c36403oaM);
        java.util.List<C36407oaQ> list = copydefault;
        if (list != null) {
            pUU.KWHzl("MentionInputHandlerRegistry", "register: applying " + list.size() + " pending mention blocks");
            c36403oaM.KWHzl(list);
            copydefault = null;
        }
    }

    public final void AEQbTJ(@NotNull android.widget.EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "");
        pUU.KWHzl("MentionInputHandlerRegistry", "unregister: editText=" + editText.hashCode());
        C36403oaM c36403oaMRemove = AEQbTJ.remove(editText);
        if (c36403oaMRemove != null) {
            WeakReference<C36403oaM> weakReference = KWHzl;
            if ((weakReference != null ? weakReference.get() : null) == c36403oaMRemove) {
                KWHzl = null;
            }
        }
    }

    public final C36403oaM copydefault() {
        WeakReference<C36403oaM> weakReference = KWHzl;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void KWHzl() {
        pUU.KWHzl("MentionInputHandlerRegistry", "addMentionedAll");
        C36403oaM c36403oaMCopydefault = copydefault();
        if (c36403oaMCopydefault != null) {
            c36403oaMCopydefault.AEQbTJ();
        }
    }

    public final void EZpvd(@NotNull java.util.List<GroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("MentionInputHandlerRegistry", "mentionMembers: count=" + list.size());
        C36403oaM c36403oaMCopydefault = copydefault();
        if (c36403oaMCopydefault != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c36403oaMCopydefault.AEQbTJ((GroupMemberInfo) it.next());
            }
        }
    }

    public final boolean copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        C36403oaM c36403oaMCopydefault = copydefault();
        if (c36403oaMCopydefault != null) {
            return c36403oaMCopydefault.KWHzl(oKMessage);
        }
        return false;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C36403oaM c36403oaMCopydefault = copydefault();
        java.lang.String strCopydefault = c36403oaMCopydefault != null ? c36403oaMCopydefault.copydefault(str) : null;
        return strCopydefault == null ? "" : strCopydefault;
    }

    public final void copydefault(@NotNull java.util.List<C36407oaQ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36403oaM c36403oaMCopydefault = copydefault();
        if (c36403oaMCopydefault != null) {
            c36403oaMCopydefault.KWHzl(list);
            copydefault = null;
            return;
        }
        pUU.KWHzl("MentionInputHandlerRegistry", "setMentionBlocks: no active handler, buffering " + list.size() + " blocks");
        copydefault = list;
    }
}
