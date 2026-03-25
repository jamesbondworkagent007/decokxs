package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15138dyf implements InterfaceC7380aij {
    private static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.dyf$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dyf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yED.AEQbTJ("market/image_gallery");
    }

    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        java.util.Collection collectionValues;
        java.util.List listAxsJAYsNCnLh;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "market/image_gallery")) {
            pUU.EZpvd("MLNTradeExperienceRouter", "launch image gallery: " + map);
            java.util.ArrayList arrayList = null;
            java.lang.Object obj = map != null ? map.get("imageUrlList") : null;
            java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map2 != null && (collectionValues = map2.values()) != null && (listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues)) != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAxsJAYsNCnLh, 10));
                java.util.Iterator it = listAxsJAYsNCnLh.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.String.valueOf(it.next()));
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                pUU.copydefault("MLNTradeExperienceRouter", "illegal params: " + map + ", none imageUrlList found.");
                return;
            }
            ActivityC7881asG.Companion.AEQbTJ(context, C33129mqd.gEmmrt(map.get("fromPage")), arrayList, C33129mqd.AhwBna(map.get("defaultSelectIndex")));
        }
    }
}
