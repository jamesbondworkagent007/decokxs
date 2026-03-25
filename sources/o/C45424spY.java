package o;

import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.biz.model.ModuleType;
import com.okinc.okex.debug.fragments.RatingDBoxFragment$triggerRatingDialog$1;
import com.okinc.okex.rating.net.RatingResult;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C47315tni;
import o.C55018xby;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.spY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45424spY extends AbstractC45451spz {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public AbstractC47369toj OLrzqt;
    public final java.lang.String EZpvd = "Unified Rating";
    public final int AEQbTJ = C47315tni.ActionBar.AuCTelauCTel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int AEQbTJ(C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45451spz
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public final C55001xbh AhwBna() {
        AbstractC47369toj abstractC47369toj = this.OLrzqt;
        if (abstractC47369toj == null) {
            Intrinsics.gEmmrt("");
            abstractC47369toj = null;
        }
        return abstractC47369toj.AEQbTJ.AkhnZx();
    }

    public final C55001xbh AEQbTJ() {
        AbstractC47369toj abstractC47369toj = this.OLrzqt;
        if (abstractC47369toj == null) {
            Intrinsics.gEmmrt("");
            abstractC47369toj = null;
        }
        return abstractC47369toj.EZpvd.AkhnZx();
    }

    public final C55001xbh EZpvd() {
        AbstractC47369toj abstractC47369toj = this.OLrzqt;
        if (abstractC47369toj == null) {
            Intrinsics.gEmmrt("");
            abstractC47369toj = null;
        }
        return abstractC47369toj.copydefault.AkhnZx();
    }

    /* JADX INFO: renamed from: o.spY$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.spY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C45424spY OLrzqt() {
            return new C45424spY();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47369toj abstractC47369tojCopydefault = AbstractC47369toj.copydefault(layoutInflater, viewGroup, false);
        this.OLrzqt = abstractC47369tojCopydefault;
        if (abstractC47369tojCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC47369tojCopydefault = null;
        }
        android.view.View root = abstractC47369tojCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47369toj abstractC47369toj = this.OLrzqt;
        if (abstractC47369toj == null) {
            Intrinsics.gEmmrt("");
            abstractC47369toj = null;
        }
        ModuleType[] moduleTypeArrValues = ModuleType.values();
        java.util.ArrayList<ModuleType> arrayList = new java.util.ArrayList();
        for (ModuleType moduleType : moduleTypeArrValues) {
            if (moduleType != ModuleType.Unknown) {
                arrayList.add(moduleType);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (ModuleType moduleType2 : arrayList) {
            arrayList2.add(new C55276xgr(moduleType2.name() + " (" + moduleType2.getValue() + ")", moduleType2, null, false, false, null, null, 124, null));
        }
        final java.util.List<C55276xgr> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        C55018xby c55018xby = abstractC47369toj.OLrzqt;
        c55018xby.setItems(listFJNWhG);
        final AbstractC52786wYh abstractC52786wYhOLrzqt = c55018xby.OLrzqt();
        if (abstractC52786wYhOLrzqt != null) {
            C55018xby.Activity activity = abstractC52786wYhOLrzqt instanceof C55018xby.Activity ? (C55018xby.Activity) abstractC52786wYhOLrzqt : null;
            if (activity != null) {
                activity.EZpvd(new Function1() { // from class: o.spW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C45424spY.KWHzl(this.AEQbTJ, abstractC52786wYhOLrzqt, (java.lang.CharSequence) obj);
                    }
                });
            }
            C55276xgr c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.firstOrNull(listFJNWhG);
            if (c55276xgr != null) {
                abstractC52786wYhOLrzqt.copydefault(c55276xgr, new Function1() { // from class: o.sqb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Integer.valueOf(C45424spY.AEQbTJ((C55276xgr) obj));
                    }
                });
                c55276xgr.copydefault(true);
            }
        }
        Activity activity2 = new Activity();
        C55001xbh c55001xbhAhwBna = AhwBna();
        if (c55001xbhAhwBna != null) {
            c55001xbhAhwBna.addTextChangedListener(activity2);
        }
        C55001xbh c55001xbhAEQbTJ = AEQbTJ();
        if (c55001xbhAEQbTJ != null) {
            c55001xbhAEQbTJ.addTextChangedListener(activity2);
        }
        C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.addTextChangedListener(activity2);
        }
        C55009xbp c55009xbpFIwbmz = abstractC47369toj.copydefault.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setValidator(new Function1() { // from class: o.sqa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45424spY.copydefault(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
        }
        abstractC47369toj.valueOf.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.sqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view2) {
                return C45424spY.AhwBna(this.AEQbTJ, view2);
            }
        });
        abstractC47369toj.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.sqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C45424spY.EZpvd(listFJNWhG, this, view2);
            }
        });
        abstractC47369toj.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.spZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C45424spY.copydefault(this.AEQbTJ, view2);
            }
        });
        abstractC47369toj.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.sqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C45424spY.OLrzqt(this.OLrzqt, view2);
            }
        });
        gEmmrt();
        view.post(new java.lang.Runnable() { // from class: o.sqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45424spY.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final Unit KWHzl(C45424spY c45424spY, AbstractC52786wYh abstractC52786wYh, java.lang.CharSequence charSequence) {
        c45424spY.gEmmrt();
        abstractC52786wYh.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.spY$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C45424spY.this.gEmmrt();
        }
    }

    public static final java.lang.String copydefault(C45424spY c45424spY, java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            return (StringsKt__StringsKt.fARcdN(charSequence) || c45424spY.KWHzl(charSequence.toString())) ? "" : "key=value&key2=value2&...";
        }
        return null;
    }

    public static final boolean AhwBna(C45424spY c45424spY, android.view.View view) {
        c45424spY.copydefault();
        return true;
    }

    public static final void EZpvd(java.util.List list, C45424spY c45424spY, android.view.View view) {
        if (!list.isEmpty()) {
            c45424spY.AYXKKw();
        }
    }

    public static final void copydefault(C45424spY c45424spY, android.view.View view) {
        android.content.Intent intent$default;
        android.content.Context context = c45424spY.getContext();
        if (context == null || (intent$default = RatingResult.toIntent$default(RatingResult.SubmittedAlready.copydefault, context, null, null, 6, null)) == null) {
            return;
        }
        c45424spY.startActivity(intent$default);
    }

    public static final void OLrzqt(C45424spY c45424spY, android.view.View view) {
        android.content.Intent intent$default;
        android.content.Context context = c45424spY.getContext();
        if (context == null || (intent$default = RatingResult.toIntent$default(RatingResult.Expired.OLrzqt, context, null, null, 6, null)) == null) {
            return;
        }
        c45424spY.startActivity(intent$default);
    }

    public static final void AYXKKw(C45424spY c45424spY) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45424spY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final ModuleType KWHzl() {
        AbstractC47369toj abstractC47369toj = this.OLrzqt;
        if (abstractC47369toj == null) {
            Intrinsics.gEmmrt("");
            abstractC47369toj = null;
        }
        for (C55276xgr c55276xgr : abstractC47369toj.OLrzqt.copydefault()) {
            if (c55276xgr.AEQbTJ()) {
                java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                return (ModuleType) objOLrzqt;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean KWHzl(java.lang.String str) {
        return new Regex("^[a-zA-Z0-9]+=.*$").matches(str);
    }

    public final void gEmmrt() {
        android.text.Editable text;
        android.text.Editable text2;
        android.text.Editable text3;
        AbstractC47369toj abstractC47369toj = this.OLrzqt;
        java.lang.String str = null;
        if (abstractC47369toj == null) {
            Intrinsics.gEmmrt("");
            abstractC47369toj = null;
        }
        Uri.Builder builderBuildUpon = android.net.Uri.parse("okx://app/support/rating").buildUpon();
        builderBuildUpon.appendQueryParameter("moduleType", KWHzl().getValue());
        C55001xbh c55001xbhAhwBna = AhwBna();
        if (c55001xbhAhwBna != null && (text3 = c55001xbhAhwBna.getText()) != null) {
            if (!(!StringsKt__StringsKt.fARcdN(text3))) {
                text3 = null;
            }
            if (text3 != null) {
                builderBuildUpon.appendQueryParameter("ratingNotificationId", text3.toString());
            }
        }
        C55001xbh c55001xbhAEQbTJ = AEQbTJ();
        if (c55001xbhAEQbTJ != null && (text2 = c55001xbhAEQbTJ.getText()) != null) {
            if (!(!StringsKt__StringsKt.fARcdN(text2))) {
                text2 = null;
            }
            if (text2 != null) {
                builderBuildUpon.appendQueryParameter("businessId", text2.toString());
            }
        }
        java.lang.String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null && (text = c55001xbhEZpvd.getText()) != null) {
            if (!(!StringsKt__StringsKt.fARcdN(text))) {
                text = null;
            }
            if (text != null) {
                str = ContainerUtils.FIELD_DELIMITER + ((java.lang.Object) text);
            }
        }
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = abstractC47369toj.valueOf;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("%s%s", java.util.Arrays.copyOf(new java.lang.Object[]{string, str}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        textView.setText(str2);
    }

    public final void copydefault() {
        android.content.Context context = getContext();
        if (context != null) {
            java.lang.Object systemService = context.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
            AbstractC47369toj abstractC47369toj = this.OLrzqt;
            if (abstractC47369toj == null) {
                Intrinsics.gEmmrt("");
                abstractC47369toj = null;
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Rating Deeplink", abstractC47369toj.valueOf.getText()));
            C55326xho.toast$default("Copied to clipboard", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RatingDBoxFragment$triggerRatingDialog$1(this, null), 3, null);
    }

    public final JsonObject OLrzqt(java.lang.String str) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        for (java.lang.String str2 : StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null)) {
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) ContainerUtils.KEY_VALUE_DELIMITER, false, 2, (java.lang.Object) null)) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                JsonElementBuildersKt.put(jsonObjectBuilder, (java.lang.String) listSplit$default.get(0), CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listSplit$default, 1), ContainerUtils.KEY_VALUE_DELIMITER, null, null, 0, null, null, 62, null));
            }
        }
        return jsonObjectBuilder.build();
    }
}
