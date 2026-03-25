package o;

import com.onesignal.OneSignal;
import com.onesignal.influence.domain.OSInfluenceChannel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C57835yps;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57873yqd {
    public final ConcurrentHashMap<java.lang.String, AbstractC57813ypW> AEQbTJ;
    public final C57816ypZ KWHzl;

    /* JADX INFO: renamed from: o.yqd$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OSInfluenceChannel.values().length];
            iArr[OSInfluenceChannel.NOTIFICATION.ordinal()] = 1;
            iArr[OSInfluenceChannel.IAM.ordinal()] = 2;
            copydefault = iArr;
        }
    }

    public C57873yqd(@NotNull InterfaceC57757yoT interfaceC57757yoT, @NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull InterfaceC57821ype interfaceC57821ype) {
        Intrinsics.checkNotNullParameter(interfaceC57757yoT, "");
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(interfaceC57821ype, "");
        ConcurrentHashMap<java.lang.String, AbstractC57813ypW> concurrentHashMap = new ConcurrentHashMap<>();
        this.AEQbTJ = concurrentHashMap;
        C57816ypZ c57816ypZ = new C57816ypZ(interfaceC57757yoT);
        this.KWHzl = c57816ypZ;
        C57814ypX c57814ypX = C57814ypX.OLrzqt;
        concurrentHashMap.put(c57814ypX.AEQbTJ(), new C57815ypY(c57816ypZ, interfaceC57738yoA, interfaceC57821ype));
        concurrentHashMap.put(c57814ypX.OLrzqt(), new C57871yqb(c57816ypZ, interfaceC57738yoA, interfaceC57821ype));
    }

    public final java.util.List<C57870yqa> AEQbTJ() {
        java.util.Collection<AbstractC57813ypW> collectionValues = this.AEQbTJ.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Collection<AbstractC57813ypW> collection = collectionValues;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC57813ypW) it.next()).OLrzqt());
        }
        return arrayList;
    }

    public final java.util.List<C57870yqa> copydefault() {
        java.util.Collection<AbstractC57813ypW> collectionValues = this.AEQbTJ.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((AbstractC57813ypW) obj).AYXKKw(), (java.lang.Object) C57814ypX.OLrzqt.AEQbTJ())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC57813ypW) it.next()).OLrzqt());
        }
        return arrayList2;
    }

    public final AbstractC57813ypW KWHzl() {
        AbstractC57813ypW abstractC57813ypW = this.AEQbTJ.get(C57814ypX.OLrzqt.AEQbTJ());
        Intrinsics.copydefault(abstractC57813ypW);
        Intrinsics.checkNotNullExpressionValue(abstractC57813ypW, "");
        return abstractC57813ypW;
    }

    public final AbstractC57813ypW EZpvd() {
        AbstractC57813ypW abstractC57813ypW = this.AEQbTJ.get(C57814ypX.OLrzqt.OLrzqt());
        Intrinsics.copydefault(abstractC57813ypW);
        Intrinsics.checkNotNullExpressionValue(abstractC57813ypW, "");
        return abstractC57813ypW;
    }

    public final java.util.List<AbstractC57813ypW> OLrzqt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(EZpvd());
        arrayList.add(KWHzl());
        return arrayList;
    }

    public final void valueOf() {
        java.util.Collection<AbstractC57813ypW> collectionValues = this.AEQbTJ.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((AbstractC57813ypW) it.next()).AkhnZx();
        }
    }

    public final void OLrzqt(@NotNull C57835yps.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl.EZpvd(taskDescription);
    }

    public final AbstractC57813ypW OLrzqt(@NotNull OneSignal.AppEntryAction appEntryAction) {
        Intrinsics.checkNotNullParameter(appEntryAction, "");
        if (appEntryAction.isNotificationClick()) {
            return EZpvd();
        }
        return null;
    }

    public final java.util.List<AbstractC57813ypW> AEQbTJ(@NotNull OneSignal.AppEntryAction appEntryAction) {
        Intrinsics.checkNotNullParameter(appEntryAction, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (appEntryAction.isAppClose()) {
            return arrayList;
        }
        AbstractC57813ypW abstractC57813ypWEZpvd = appEntryAction.isAppOpen() ? EZpvd() : null;
        if (abstractC57813ypWEZpvd != null) {
            arrayList.add(abstractC57813ypWEZpvd);
        }
        arrayList.add(KWHzl());
        return arrayList;
    }

    public final void KWHzl(@NotNull JSONObject jSONObject, @NotNull java.util.List<C57870yqa> list) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(list, "");
        for (C57870yqa c57870yqa : list) {
            if (ActionBar.copydefault[c57870yqa.AEQbTJ().ordinal()] == 1) {
                EZpvd().EZpvd(jSONObject, c57870yqa);
            }
        }
    }
}
