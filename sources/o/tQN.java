package o;

import com.okinc.planet.biz_content.input.data.InputHyperlinkType;
import com.okinc.planet.domain.remote.dto.CashTag;
import com.okinc.planet.domain.remote.dto.ContentTags;
import com.okinc.planet.domain.remote.dto.HashTag;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47625tte;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tQN {
    public static final tQN EZpvd = new tQN();

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputHyperlinkType.values().length];
            try {
                iArr[InputHyperlinkType.TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InputHyperlinkType.TOPIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InputHyperlinkType.LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    private tQN() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tQN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentTags convertContentTags$default(tQN tqn, C47625tte c47625tte, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        return tqn.AEQbTJ(c47625tte, list, map);
    }

    public final ContentTags AEQbTJ(@NotNull C47625tte c47625tte, @NotNull java.util.List<C47625tte.Activity> list, @NotNull java.util.Map<java.lang.String, Activity> map) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c47625tte, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            C47625tte.Activity activity = (C47625tte.Activity) obj;
            java.lang.String str = activity.EZpvd().name() + "_" + activity.OLrzqt();
            java.lang.Object arrayList3 = linkedHashMap.get(str);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(str, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C47625tte.Activity activity2 = (C47625tte.Activity) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) entry.getValue());
            int i = ActionBar.KWHzl[activity2.EZpvd().ordinal()];
            if (i == 1) {
                arrayList.add(new CashTag(C46448tUs.KWHzl.EZpvd(activity2.OLrzqt()), activity2.OLrzqt(), c47625tte.OLrzqt(activity2.OLrzqt(), InputHyperlinkType.TOKEN)));
            } else if (i == 2) {
                arrayList2.add(new HashTag(C46448tUs.KWHzl.copydefault(activity2.OLrzqt()), activity2.KWHzl(), (java.util.List) c47625tte.OLrzqt(activity2.OLrzqt(), InputHyperlinkType.TOPIC), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 0, 24, (DefaultConstructorMarker) null));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.List<java.lang.Integer> listOLrzqt = c47625tte.OLrzqt(activity2.OLrzqt(), InputHyperlinkType.LINK);
                Activity activity3 = map.get(activity2.OLrzqt());
                arrayList2.add(new HashTag(activity2.OLrzqt(), "", listOLrzqt, (activity3 == null || (strAEQbTJ = activity3.AEQbTJ()) == null) ? activity2.OLrzqt() : strAEQbTJ, activity3 != null ? activity3.KWHzl() : null, 1));
            }
        }
        return new ContentTags(arrayList, arrayList2);
    }

    public final java.lang.String AEQbTJ() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public static final class Activity {
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = activity.copydefault;
            }
            return activity.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(java.lang.String str, java.lang.String str2) {
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.copydefault;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LinkTagMeta(linkUrl=" + this.OLrzqt + ", deeplinkUrl=" + this.copydefault + ")";
        }

        public Activity(java.lang.String str, java.lang.String str2) {
            this.OLrzqt = str;
            this.copydefault = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:117) call: o.tQN.Activity.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public final java.util.List<PublishImageItem> OLrzqt(@NotNull java.util.List<ImageItem> list) {
        PublishImageItem publishImageItem;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ImageItem imageItem : list) {
            java.lang.String remoteUrl = imageItem.getRemoteUrl();
            if (remoteUrl != null) {
                java.lang.String width = imageItem.getWidth();
                java.lang.String str = width == null ? "" : width;
                java.lang.String height = imageItem.getHeight();
                java.lang.String str2 = height == null ? "" : height;
                java.lang.String fileSize = imageItem.getFileSize();
                publishImageItem = new PublishImageItem(remoteUrl, (java.lang.String) null, str, str2, (java.lang.String) null, fileSize == null ? "" : fileSize, 18, (DefaultConstructorMarker) null);
            } else {
                publishImageItem = null;
            }
            if (publishImageItem != null) {
                arrayList.add(publishImageItem);
            }
        }
        return arrayList;
    }
}
