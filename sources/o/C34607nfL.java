package o;

import androidx.collection.ArrayMapKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.dexkline.market.features.overview.domain.MemeInfo;
import com.okinc.dexkline.market.features.tag.domain.CompactTag;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34607nfL {
    public static final java.util.List<TagWrapper> AEQbTJ(MemeInfo memeInfo, @NotNull java.util.List<TagWrapper> list) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next).KWHzl(), (java.lang.Object) "communityRecognized")) {
                break;
            }
        }
        TagWrapper tagWrapper = (TagWrapper) next;
        if (tagWrapper != null) {
            arrayList.add(tagWrapper);
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next2).KWHzl(), (java.lang.Object) "duringEvent")) {
                break;
            }
        }
        TagWrapper tagWrapper2 = (TagWrapper) next2;
        if (tagWrapper2 != null) {
            arrayList.add(tagWrapper2);
        }
        TagWrapper tagWrapperAEQbTJ = AEQbTJ(memeInfo);
        if (tagWrapperAEQbTJ != null) {
            arrayList.add(tagWrapperAEQbTJ);
        }
        java.util.Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next3 = it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next3).KWHzl(), (java.lang.Object) "lowLiquidity")) {
                obj = next3;
                break;
            }
        }
        TagWrapper tagWrapper3 = (TagWrapper) obj;
        if (tagWrapper3 != null) {
            arrayList.add(tagWrapper3);
        }
        return arrayList;
    }

    public static final TagWrapper AEQbTJ(MemeInfo memeInfo) {
        java.lang.String strOLrzqt = memeInfo != null ? memeInfo.OLrzqt() : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        java.lang.String strAEQbTJ = memeInfo != null ? memeInfo.AEQbTJ() : null;
        if (strAEQbTJ == null || strAEQbTJ.length() <= 0) {
            return null;
        }
        return new TagWrapper(new CompactTag(strOLrzqt, false, null, 6, null), new TagMeta(strOLrzqt, strOLrzqt, null, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.gGNlxh), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(MTPushConstants.PlatformNode.KEY_PLATFORM, strOLrzqt))), strAEQbTJ, strAEQbTJ, strAEQbTJ, strAEQbTJ, null, null, null, null, 0, true, 7940, null));
    }
}
