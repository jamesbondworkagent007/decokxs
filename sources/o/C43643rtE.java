package o;

import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43643rtE {
    public static final C43643rtE copydefault = new C43643rtE();
    public static final LinkedHashSet<MediaInfo> KWHzl = new LinkedHashSet<>();
    public static final int AEQbTJ = 8;

    private C43643rtE() {
    }

    public final void EZpvd(@NotNull java.util.List<? extends MediaInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        KWHzl.addAll(list);
    }

    public final java.util.Set<MediaInfo> copydefault() {
        LinkedHashSet<MediaInfo> linkedHashSet = KWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedHashSet) {
            if (((MediaInfo) obj).AhwBna() == MediaPickerType.TYPE_IMAGE) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }

    public final java.util.Set<MediaInfo> AEQbTJ() {
        LinkedHashSet<MediaInfo> linkedHashSet = KWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedHashSet) {
            if (((MediaInfo) obj).AhwBna() == MediaPickerType.TYPE_VIDEO) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }
}
