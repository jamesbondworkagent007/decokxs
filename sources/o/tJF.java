package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.common.Scopes;
import com.immomo.mls.InitData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class tJF extends AbstractC43061riF {
    public static boolean EZpvd;
    public boolean copydefault;
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "MarketDiscoverScrollHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.OBJEWx;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final tJF OLrzqt(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd = z;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("authorId", str);
        bundle.putString("pinContent", str2);
        tJF tjf = new tJF();
        tjf.setArguments(bundle);
        return tjf;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C47501trL.TaskDescription.DcMfJKsgNvtZ);
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        if (EZpvd) {
            android.view.ViewGroup viewGroupEZpvd = EZpvd();
            if (viewGroupEZpvd != null) {
                viewGroupEZpvd.setPadding(0, 0, 0, C55298xhM.dp2px$default(74.0f, null, 1, null));
            }
        } else {
            android.view.ViewGroup viewGroupEZpvd2 = EZpvd();
            if (viewGroupEZpvd2 != null) {
                viewGroupEZpvd2.setPadding(0, 0, 0, 0);
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.tJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tJF.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(tJF tjf) {
        if (tjf.copydefault) {
            return;
        }
        tjf.copydefault = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) tjf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        java.util.Map linkedHashMap;
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        java.util.Map<java.lang.String, java.lang.Object> mapAEQbTJ = AEQbTJ(arguments != null ? arguments.getString("pinContent") : null);
        if (mapAEQbTJ == null || (linkedHashMap = C56424yEw.isConnected(mapAEQbTJ)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(MTPushConstants.PlatformNode.KEY_PLATFORM, Scopes.PROFILE);
        C43056riA c43056riA = C43056riA.AEQbTJ;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("hiddenTopBannerWhenProfile", "1");
        pairArr[1] = C56390yDp.OLrzqt("extraParams", linkedHashMap);
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("authorId")) == null) {
            string = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("authorId", string);
        return c43056riA.EZpvd("market", "/feed/profile", C56424yEw.gEmmrt(pairArr));
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ(java.lang.String str) {
        if (str != null) {
            try {
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "");
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        java.lang.Object obj = jSONObject.get(next);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        linkedHashMap.put(next, KWHzl(obj));
                    }
                    return linkedHashMap;
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("PlanetProfileFeedFragment", "Failed to parse JSON: " + e.getMessage());
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x002f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    public final java.lang.Object KWHzl(java.lang.Object obj) throws JSONException {
        ?? arrayList;
        if (obj instanceof JSONObject) {
            arrayList = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "");
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj2 = jSONObject.get(next);
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                arrayList.put(next, KWHzl(obj2));
            }
        } else {
            if (!(obj instanceof JSONArray)) {
                return obj;
            }
            arrayList = new java.util.ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                java.lang.Object obj3 = jSONArray.get(i);
                Intrinsics.checkNotNullExpressionValue(obj3, "");
                arrayList.add(KWHzl(obj3));
            }
        }
        return arrayList;
    }
}
