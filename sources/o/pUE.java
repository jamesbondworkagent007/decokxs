package o;

import com.okinc.core.util.SPUtils;
import com.okinc.localization2.bean.StringArrayType;
import com.tencent.mmkv.MMKV;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pUE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final android.content.Context AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public pUE(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pUE.KWHzl(this.EZpvd);
            }
        });
    }

    public final MMKV OLrzqt() {
        return (MMKV) this.OLrzqt.getValue();
    }

    public static final MMKV KWHzl(pUE pue) {
        return MMKV.KWHzl("startupKeys", new java.io.File(pTG.OLrzqt.OLrzqt(pue.AEQbTJ, "config")).getCanonicalPath());
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        AEQbTJ();
        OLrzqt(OLrzqt(), list, "updateStartupKeys");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OLrzqt().KWHzl((java.lang.String) it.next(), 0);
        }
        OLrzqt().copydefault();
        pUU.KWHzl("StartupKeysRepo", "updateStartupKeys, update keys size:" + list.size());
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void AEQbTJ() {
        if (!pTG.OLrzqt.EZpvd(this.AEQbTJ, "", "startup_keys.json")) {
            pUU.KWHzl("StartupKeysRepo", "loadEmbeddedStartupKeysIfNeed, no startup_keys.json exist. return");
            return;
        }
        if (KWHzl()) {
            return;
        }
        try {
            java.io.InputStream inputStreamOpen = this.AEQbTJ.getAssets().open("startup_keys.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                yFA.copydefault(bufferedReader, null);
                java.util.Iterator<JsonElement> it = JsonElementKt.getJsonArray(oJV.AEQbTJ.DbNXlk().parseToJsonElement(strAEQbTJ)).iterator();
                while (it.hasNext()) {
                    OLrzqt().KWHzl(JsonElementKt.getJsonPrimitive(it.next()).getContent(), 0);
                }
                int iCopydefault = C34703nhO.copydefault(this.AEQbTJ);
                SPUtils.put("migrate_startup_keys_version", java.lang.Integer.valueOf(iCopydefault));
                pUU.KWHzl("StartupKeysRepo", "loadEmbeddedStartupKeysIfNeed, load finished. code:" + iCopydefault);
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.valueOf("StartupKeysRepo", "loadEmbeddedStartupKeysIfNeed, error:" + e.getMessage());
        }
    }

    public final boolean KWHzl() {
        int iCopydefault = C34703nhO.copydefault(this.AEQbTJ);
        java.lang.Integer num = SPUtils.getInt("migrate_startup_keys_version", -1);
        return num != null && iCopydefault == num.intValue();
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        java.lang.String[] strArrAEQbTJ = OLrzqt().AEQbTJ();
        if (strArrAEQbTJ == null) {
            return yDY.AhwBna();
        }
        return yDV.AwvSrB(strArrAEQbTJ);
    }

    public final kotlin.Pair<MMKV, MMKV> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new kotlin.Pair<>(OLrzqt(), copydefault(str));
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.ArrayList<java.lang.Object> arrayList2, @NotNull java.util.ArrayList<java.lang.Integer> arrayList3, @NotNull Continuation<? super Unit> continuation) {
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        MMKV mmkvCopydefault = copydefault(str);
        pTL.OLrzqt(arrayList.size() == arrayList2.size() && arrayList.size() == arrayList3.size(), "updateStartupStrings, size not matched");
        OLrzqt(mmkvCopydefault, arrayList, "updateStartupStrings");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str2 = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            java.lang.String str3 = str2;
            java.lang.Object obj = arrayList2.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.Integer num = arrayList3.get(i);
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            OLrzqt().KWHzl(str3, iIntValue);
            if (iIntValue == 2) {
                mmkvCopydefault.OLrzqt(str3, (StringArrayType) obj);
            } else {
                mmkvCopydefault.EZpvd(str3, (java.lang.String) obj);
            }
        }
        mmkvCopydefault.copydefault();
        OLrzqt().copydefault();
        pUU.KWHzl("StartupKeysRepo", "updateStartupStrings, update keys size:" + arrayList.size() + ". for:" + str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull MMKV mmkv, @NotNull java.util.Collection<java.lang.String> collection, @NotNull java.lang.String str) {
        java.lang.String[] strArrAEQbTJ;
        Intrinsics.checkNotNullParameter(mmkv, "");
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("StartupKeysRepo", "ensureCapacity, start. checkKV:" + mmkv.OLrzqt() + ",addItems:" + collection.size() + ", from:" + str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.lang.String[] strArrAEQbTJ2 = mmkv.AEQbTJ();
        if (strArrAEQbTJ2 != null) {
            C56406yEe.KWHzl(linkedHashSet, strArrAEQbTJ2);
        }
        linkedHashSet.addAll(collection);
        int size = linkedHashSet.size() - 2000;
        if (size <= 0 || (strArrAEQbTJ = mmkv.AEQbTJ()) == null) {
            return;
        }
        java.util.List listAhwBna = yDV.AhwBna(strArrAEQbTJ, size);
        pUU.KWHzl("StartupKeysRepo", "ensureCapacity, remove:" + listAhwBna.size());
        C38304pTv.KWHzl.copydefault(OLrzqt(), (java.lang.String[]) listAhwBna.toArray(new java.lang.String[0]));
    }

    public final MMKV copydefault(java.lang.String str) {
        MMKV mmkvKWHzl = MMKV.KWHzl("startupStrings", new java.io.File(pTG.OLrzqt.OLrzqt(this.AEQbTJ, str)).getCanonicalPath());
        Intrinsics.checkNotNullExpressionValue(mmkvKWHzl, "");
        return mmkvKWHzl;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
