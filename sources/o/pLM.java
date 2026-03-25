package o;

import com.okinc.lifecycle.impl.deeplink.handler.DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pLM implements InterfaceC43234rlT {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC38164pOp EZpvd;

    @yCM
    public pLM(@NotNull InterfaceC38164pOp interfaceC38164pOp) {
        Intrinsics.checkNotNullParameter(interfaceC38164pOp, "");
        this.EZpvd = interfaceC38164pOp;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pLM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        copydefault(context);
    }

    public final void copydefault(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List<C43240rlZ> listAhwBna;
        if (C34703nhO.AEQbTJ()) {
            str = "okxtr://";
        } else {
            str = C34703nhO.copydefault() ? "okxwallet://" : "okx://";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.String, InterfaceC43233rlS> mapCopydefault = C43239rlY.AEQbTJ.copydefault();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(mapCopydefault.size());
        java.util.Iterator<Map.Entry<java.lang.String, InterfaceC43233rlS>> it = mapCopydefault.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC43233rlS value = it.next().getValue();
            java.lang.String strOLrzqt = value.OLrzqt();
            java.lang.Object orDefault = linkedHashMap.getOrDefault(value.OLrzqt(), new java.util.ArrayList());
            ((java.util.List) orDefault).add(value);
            linkedHashMap.put(strOLrzqt, orDefault);
            arrayList2.add(Unit.INSTANCE);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.util.List<InterfaceC43233rlS> list = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (InterfaceC43233rlS interfaceC43233rlS : list) {
                arrayList3.add(interfaceC43233rlS.KWHzl().getMode());
                arrayList4.add(str + interfaceC43233rlS.KWHzl().getMode() + "/" + str3);
                InterfaceC56387yDm<InterfaceC43234rlT> interfaceC56387yDm = C43239rlY.AEQbTJ.EZpvd().get(interfaceC43233rlS.KWHzl().getMode() + "/" + str3);
                InterfaceC43234rlT value2 = interfaceC56387yDm != null ? interfaceC56387yDm.getValue() : null;
                java.lang.String name = value2 != null ? value2.getClass().getName() : "";
                Intrinsics.copydefault((java.lang.Object) name);
                arrayList5.add(name);
            }
            if (arrayList3.contains(DeeplinkMode.PRO.getMode()) && arrayList3.contains(DeeplinkMode.LITE.getMode())) {
                arrayList3.add("exchange");
                arrayList4.add(str + "exchange/" + str3);
            }
            InterfaceC43233rlS interfaceC43233rlS2 = (InterfaceC43233rlS) CollectionsKt___CollectionsKt.firstOrNull(list);
            boolean zCopydefault = interfaceC43233rlS2 != null ? interfaceC43233rlS2.copydefault() : false;
            InterfaceC43233rlS interfaceC43233rlS3 = (InterfaceC43233rlS) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (interfaceC43233rlS3 == null || (listAhwBna = interfaceC43233rlS3.AEQbTJ()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.add(new pLS(str3, arrayList3, zCopydefault, listAhwBna, arrayList4, null, arrayList5, 32, null));
        }
        if (C34703nhO.AEQbTJ()) {
            str2 = "OKXTR";
        } else {
            str2 = C34703nhO.copydefault() ? "OKXWallet" : "OKX";
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3(this, new pLX(new pLG(str2, "Android", C32979mnm.EZpvd.EZpvd(), java.lang.String.valueOf(java.lang.System.currentTimeMillis())), arrayList), null), 3, null);
        } catch (java.lang.Exception unused) {
            pUU.OLrzqt("Deeplink Info upload failed");
        }
    }
}
