package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bumptech.glide.Glide;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import o.C52761wXj;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rRH extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public Fragment AYXKKw;
    public java.lang.String AhwBna;
    public boolean AkhnZx;
    public java.lang.String AuCTel;
    public java.util.Map<java.lang.Integer, InterfaceC55105xdf> DbNXlk;
    public FreeTextAppModel EZpvd;
    public java.util.List<java.lang.String> KWHzl;
    public android.content.Context OLrzqt;
    public C55113xdn djBIcL;
    public final java.util.List<C55102xdc> ejfBZ;
    public int fJNWhG;
    public Function0<Unit> fetchVPNInfo;
    public C43958rzB gEmmrt;
    public Function1<? super TaskDescription, Unit> isConnected;
    public java.lang.Boolean valueOf;
    public boolean values;

    public static class Dialog {
    }

    public rRH() {
        this.valueOf = java.lang.Boolean.FALSE;
        this.KWHzl = new java.util.ArrayList();
        this.DbNXlk = new LinkedHashMap();
        this.ejfBZ = new java.util.ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r12v0 android.content.Context)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (r15v0 boolean)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel) : (r16v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (r18v0 kotlin.jvm.functions.Function0)
  (r19v0 kotlin.jvm.functions.Function1)
 A[MD:(android.content.Context, java.lang.String, java.lang.String, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super o.rRH$TaskDescription, kotlin.Unit>):void (m)] (LINE:51) call: o.rRH.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ rRH(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, FreeTextAppModel freeTextAppModel, boolean z2, Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : str2, z, (i & 16) != 0 ? null : freeTextAppModel, (i & 32) != 0 ? false : z2, function0, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rRH(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, boolean z, FreeTextAppModel freeTextAppModel, boolean z2, @NotNull Function0<Unit> function0, @NotNull final Function1<? super TaskDescription, Unit> function1) {
        this();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = context;
        this.AuCTel = str;
        this.AEQbTJ = str2;
        this.AkhnZx = z;
        this.EZpvd = freeTextAppModel;
        this.values = z2;
        this.fetchVPNInfo = function0;
        this.isConnected = function1;
        this.AYXKKw = new Fragment(context, yDY.AhwBna(), new Function1() { // from class: o.rRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rRH.OLrzqt(function1, this, (rRH.TaskDescription) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, rRH rrh, TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        function1.invoke(taskDescription);
        rrh.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.AkhnZx) {
            setDynamicFullScreen(true);
        }
        if (this.isConnected == null || this.fetchVPNInfo == null) {
            dismissAllowingStateLoss();
        }
    }

    public final void copydefault() {
        C43958rzB c43958rzB = this.gEmmrt;
        if (c43958rzB != null) {
            c43958rzB.AhwBna.setVisibility(8);
            c43958rzB.valueOf.setVisibility(8);
            C55113xdn c55113xdn = this.djBIcL;
            C55113xdn c55113xdn2 = null;
            if (c55113xdn == null) {
                Intrinsics.gEmmrt("");
                c55113xdn = null;
            }
            c55113xdn.setAutoMirrored(true);
            C55113xdn c55113xdn3 = this.djBIcL;
            if (c55113xdn3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55113xdn2 = c55113xdn3;
            }
            c55113xdn2.KWHzl(0L);
        }
    }

    public final void EZpvd() {
        C55113xdn c55113xdn = this.djBIcL;
        if (c55113xdn == null) {
            Intrinsics.gEmmrt("");
            c55113xdn = null;
        }
        c55113xdn.copydefault();
    }

    private final void AEQbTJ() {
        this.fJNWhG = 0;
        this.KWHzl.clear();
        this.ejfBZ.clear();
        this.DbNXlk.clear();
    }

    private final void OLrzqt() {
        if (this.fJNWhG == 0) {
            return;
        }
        KWHzl();
    }

    private final void KWHzl() {
        C55042xcV c55042xcV;
        C55042xcV c55042xcVOLrzqt;
        this.ejfBZ.clear();
        if (this.KWHzl.size() == 0) {
            return;
        }
        int i = this.fJNWhG;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC55105xdf interfaceC55105xdf = this.DbNXlk.get(java.lang.Integer.valueOf(i2));
            Intrinsics.copydefault(interfaceC55105xdf);
            int size = interfaceC55105xdf.getSectionDataList().size();
            if (!android.text.TextUtils.isEmpty(this.KWHzl.get(i2))) {
                size++;
            }
            for (int i3 = 0; i3 < size; i3++) {
                this.ejfBZ.add(new C55102xdc(false, this.KWHzl.get(i2), null, 5, null));
            }
        }
        C43958rzB c43958rzB = this.gEmmrt;
        if (c43958rzB == null || (c55042xcV = c43958rzB.AYXKKw) == null || (c55042xcVOLrzqt = c55042xcV.OLrzqt(this.ejfBZ)) == null) {
            return;
        }
        c55042xcVOLrzqt.requestLayout();
    }

    private final void OLrzqt(InterfaceC55105xdf interfaceC55105xdf) {
        this.DbNXlk.put(java.lang.Integer.valueOf(this.fJNWhG), interfaceC55105xdf);
        this.fJNWhG++;
        OLrzqt();
    }

    private final void AEQbTJ(java.util.List<java.lang.String> list) {
        java.util.List<java.lang.String> list2 = this.KWHzl;
        list2.clear();
        list2.addAll(list);
        KWHzl();
    }

    public static /* synthetic */ void updateAnchorData$default(rRH rrh, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        rrh.OLrzqt(list, z);
    }

    public final void OLrzqt(java.util.List<? extends Dialog> list, boolean z) {
        java.lang.String str;
        if (this.values) {
            AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str2 = "";
            if (z && C33129mqd.OLrzqt((java.lang.CharSequence) this.AhwBna) && (str = this.AhwBna) != null) {
                C55102xdc c55102xdc = new C55102xdc(false, null, yDY.AhwBna(new TaskDescription(str, null, null, str, null, true, true, null, null, java.lang.Boolean.TRUE, null, null, null, null, null, null, null, null, null, 523650, null)), 2, null);
                arrayList.add("");
                OLrzqt(c55102xdc);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i = 0;
            boolean z2 = false;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                Dialog dialog = (Dialog) obj;
                if (dialog instanceof StateListAnimator) {
                    z2 = i == 0 && !C59449zhJ.gEmmrt(((StateListAnimator) dialog).KWHzl(), IEncryptorType.DEFAULT_ENCRYPTOR, true);
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                        OLrzqt(new C55102xdc(!z2, str2, arrayList2));
                        arrayList2 = new java.util.ArrayList();
                    }
                    java.lang.String strKWHzl = z2 ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : ((StateListAnimator) dialog).KWHzl();
                    java.lang.String strKWHzl2 = ((StateListAnimator) dialog).KWHzl();
                    arrayList.add(strKWHzl);
                    str2 = strKWHzl2;
                } else if (dialog instanceof TaskDescription) {
                    arrayList2.add(dialog);
                }
                i++;
            }
            if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
                OLrzqt(new C55102xdc(!z2, str2, arrayList2));
                new java.util.ArrayList();
            }
            AEQbTJ(arrayList);
        }
    }

    public static /* synthetic */ void updateDataSet$default(rRH rrh, java.util.List list, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        rrh.KWHzl(list, str, bool, str2);
    }

    public final void KWHzl(@NotNull final java.util.List<? extends Dialog> list, java.lang.String str, java.lang.Boolean bool, java.lang.String str2) {
        C43958rzB c43958rzB;
        C55042xcV c55042xcV;
        C43958rzB c43958rzB2;
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd();
        if (str != null && str.length() != 0 && (c43958rzB2 = this.gEmmrt) != null) {
            c43958rzB2.OLrzqt.setVisibility(0);
            c43958rzB2.OLrzqt.setText(str);
        }
        this.valueOf = bool;
        this.AhwBna = str2;
        if (this.values && (c43958rzB = this.gEmmrt) != null && (c55042xcV = c43958rzB.AYXKKw) != null) {
            c55042xcV.setVisibility(0);
        }
        android.content.Context context = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AhwBna)) {
            OLrzqt(list);
        } else {
            Fragment fragment = this.AYXKKw;
            if (fragment == null) {
                Intrinsics.gEmmrt("");
                fragment = null;
            }
            fragment.OLrzqt(list);
            updateAnchorData$default(this, list, false, 2, null);
        }
        final C43958rzB c43958rzB3 = this.gEmmrt;
        if (c43958rzB3 != null) {
            c43958rzB3.valueOf.setVisibility(0);
            Fragment fragment2 = this.AYXKKw;
            if (fragment2 == null) {
                Intrinsics.gEmmrt("");
                fragment2 = null;
            }
            fragment2.notifyDataSetChanged();
            if (this.AkhnZx) {
                c43958rzB3.AhwBna.setVisibility(0);
                android.widget.EditText editTextEZpvd = c43958rzB3.AhwBna.EZpvd();
                android.content.Context context2 = this.OLrzqt;
                if (context2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    context = context2;
                }
                editTextEZpvd.setHint(context.getString(C43662rtX.Dialog.call));
                c43958rzB3.AhwBna.setClearCallback(new Function0() { // from class: o.rRE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rRH.OLrzqt(c43958rzB3, this, list);
                    }
                });
                c43958rzB3.AhwBna.EZpvd().addTextChangedListener(new FragmentManager(c43958rzB3, this, list));
            }
        }
    }

    public static final Unit OLrzqt(C43958rzB c43958rzB, rRH rrh, java.util.List list) {
        c43958rzB.copydefault.setVisibility(8);
        c43958rzB.valueOf.setVisibility(0);
        Fragment fragment = rrh.AYXKKw;
        Fragment fragment2 = null;
        if (fragment == null) {
            Intrinsics.gEmmrt("");
            fragment = null;
        }
        fragment.OLrzqt(list);
        c43958rzB.AYXKKw.setVisibility(rrh.values ? 0 : 8);
        updateAnchorData$default(rrh, list, false, 2, null);
        Fragment fragment3 = rrh.AYXKKw;
        if (fragment3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            fragment2 = fragment3;
        }
        fragment2.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static final class FragmentManager implements android.text.TextWatcher {
        public final /* synthetic */ rRH AEQbTJ;
        public final /* synthetic */ java.util.List<Dialog> EZpvd;
        public final /* synthetic */ C43958rzB OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.rRH$Dialog> */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(C43958rzB c43958rzB, rRH rrh, java.util.List<? extends Dialog> list) {
            this.OLrzqt = c43958rzB;
            this.AEQbTJ = rrh;
            this.EZpvd = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) throws java.io.IOException {
            java.lang.String strValueOf = java.lang.String.valueOf(editable);
            Fragment fragment = null;
            if (strValueOf.length() == 0) {
                this.OLrzqt.AYXKKw.setVisibility(0);
                Fragment fragment2 = this.AEQbTJ.AYXKKw;
                if (fragment2 == null) {
                    Intrinsics.gEmmrt("");
                    fragment2 = null;
                }
                fragment2.OLrzqt(this.EZpvd);
                rRH.updateAnchorData$default(this.AEQbTJ, this.EZpvd, false, 2, null);
            } else {
                this.OLrzqt.AYXKKw.setVisibility(8);
                java.util.List<? extends Dialog> listEZpvd = this.AEQbTJ.EZpvd(this.EZpvd, strValueOf);
                if (!Intrinsics.EZpvd(this.AEQbTJ.valueOf, java.lang.Boolean.TRUE)) {
                    if (listEZpvd.isEmpty()) {
                        this.OLrzqt.copydefault.setVisibility(0);
                        this.OLrzqt.valueOf.setVisibility(8);
                    } else {
                        this.OLrzqt.copydefault.setVisibility(8);
                        this.OLrzqt.valueOf.setVisibility(0);
                    }
                }
                Fragment fragment3 = this.AEQbTJ.AYXKKw;
                if (fragment3 == null) {
                    Intrinsics.gEmmrt("");
                    fragment3 = null;
                }
                fragment3.OLrzqt(listEZpvd);
            }
            Fragment fragment4 = this.AEQbTJ.AYXKKw;
            if (fragment4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                fragment = fragment4;
            }
            fragment.notifyDataSetChanged();
        }
    }

    public final void OLrzqt(java.util.List<? extends Dialog> list) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AhwBna) && (str = this.AhwBna) != null) {
            arrayList.add(new TaskDescription(str, null, null, str, null, true, true, null, null, java.lang.Boolean.TRUE, null, null, null, null, null, null, null, null, null, 523650, null));
            arrayList.addAll(list);
        }
        Fragment fragment = this.AYXKKw;
        if (fragment == null) {
            Intrinsics.gEmmrt("");
            fragment = null;
        }
        fragment.OLrzqt(arrayList);
        OLrzqt(list, true);
    }

    public final java.util.List<Dialog> EZpvd(java.util.List<? extends Dialog> list, final java.lang.String str) throws java.io.IOException {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (Dialog dialog : list) {
            if (dialog instanceof TaskDescription) {
                TaskDescription taskDescription = (TaskDescription) dialog;
                if (taskDescription.DbNXlk() != null && (!r4.isEmpty())) {
                    java.util.Iterator<java.lang.String> it = taskDescription.DbNXlk().iterator();
                    while (it.hasNext()) {
                        java.lang.String lowerCase = it.next().toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int length = lowerCase.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = lowerCase.charAt(i);
                            if (!CharsKt__CharJVMKt.EZpvd(cCharAt)) {
                                sb.append(cCharAt);
                            }
                        }
                        java.lang.String string = sb.toString();
                        java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        int length2 = lowerCase2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char cCharAt2 = lowerCase2.charAt(i2);
                            if (!CharsKt__CharJVMKt.EZpvd(cCharAt2)) {
                                sb2.append(cCharAt2);
                            }
                        }
                        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) sb2.toString(), false, 2, (java.lang.Object) null)) {
                            arrayList2.add(dialog);
                        }
                    }
                }
                java.lang.String lowerCase3 = taskDescription.values().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                int length3 = lowerCase3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    char cCharAt3 = lowerCase3.charAt(i3);
                    if (!CharsKt__CharJVMKt.EZpvd(cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                }
                java.lang.String string2 = sb3.toString();
                java.lang.String lowerCase4 = str.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                int length4 = lowerCase4.length();
                for (int i4 = 0; i4 < length4; i4++) {
                    char cCharAt4 = lowerCase4.charAt(i4);
                    if (!CharsKt__CharJVMKt.EZpvd(cCharAt4)) {
                        sb4.append(cCharAt4);
                    }
                }
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string2, (java.lang.CharSequence) sb4.toString(), false, 2, (java.lang.Object) null)) {
                    arrayList2.add(dialog);
                }
            }
        }
        final Function2 function2 = new Function2() { // from class: o.rRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(rRH.KWHzl(str, (rRH.Dialog) obj, (rRH.Dialog) obj2));
            }
        };
        C56407yEf.copydefault(arrayList2, new java.util.Comparator() { // from class: o.rRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return rRH.OLrzqt(function2, obj, obj2);
            }
        });
        java.lang.Boolean bool = this.valueOf;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (!Intrinsics.EZpvd(bool, bool2) || copydefault(arrayList2, str)) {
            arrayList = arrayList2;
        } else {
            arrayList = arrayList2;
            arrayList.add(0, new TaskDescription(str, null, null, str, str, true, false, null, null, bool2, java.lang.Boolean.valueOf(arrayList2.isEmpty()), null, null, 0 == true ? 1 : 0, null, null, null, null, null, 522626, null));
        }
        return CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
    }

    public static final int OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int KWHzl(java.lang.String str, Dialog dialog, Dialog dialog2) {
        if ((dialog instanceof TaskDescription) && (dialog2 instanceof TaskDescription)) {
            return ((TaskDescription) dialog).copydefault(str, (TaskDescription) dialog2);
        }
        return 0;
    }

    public final boolean copydefault(java.util.List<? extends Dialog> list, java.lang.String str) {
        boolean z = str.length() == 0;
        for (Dialog dialog : list) {
            if ((dialog instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) ((TaskDescription) dialog).values(), (java.lang.Object) str)) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        try {
            C43699ruH c43699ruH = C43699ruH.KWHzl;
            if (c43699ruH.KWHzl(requireActivity())) {
                c43699ruH.copydefault();
            }
        } catch (java.lang.Exception unused) {
        }
        Function0<Unit> function0 = this.fetchVPNInfo;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        function0.invoke();
        C43958rzB c43958rzB = this.gEmmrt;
        if (c43958rzB != null) {
            c43958rzB.AEQbTJ.cancelAnimation();
            c43958rzB.AhwBna.gEmmrt();
            c43958rzB.AhwBna.setClearCallback(null);
        }
        this.gEmmrt = null;
        setBinding(null);
        super.onDestroyView();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(3);
        java.lang.String str = this.AuCTel;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        c52781wYc.setTitle(str);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        android.content.Context context = this.OLrzqt;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        C43958rzB c43958rzBCopydefault = C43958rzB.copydefault(android.view.LayoutInflater.from(context), constraintLayout, true);
        this.gEmmrt = c43958rzBCopydefault;
        if (c43958rzBCopydefault != null) {
            this.djBIcL = c43958rzBCopydefault.AEQbTJ;
            java.lang.String str = this.AEQbTJ;
            if (str != null && str.length() != 0) {
                c43958rzBCopydefault.OLrzqt.setVisibility(0);
                c43958rzBCopydefault.OLrzqt.setText(this.AEQbTJ);
            }
            RecyclerView recyclerView = c43958rzBCopydefault.valueOf;
            Fragment fragment = this.AYXKKw;
            if (fragment == null) {
                Intrinsics.gEmmrt("");
                fragment = null;
            }
            recyclerView.setAdapter(fragment);
            android.content.Context context2 = this.OLrzqt;
            if (context2 == null) {
                Intrinsics.gEmmrt("");
                context2 = null;
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2);
            c43958rzBCopydefault.valueOf.setLayoutManager(linearLayoutManager);
            c43958rzBCopydefault.AYXKKw.setLayoutManager(linearLayoutManager);
            FreeTextAppModel freeTextAppModel = this.EZpvd;
            if (freeTextAppModel != null) {
                freeTextAppModel.setBottomMargin(java.lang.Float.valueOf(0.0f));
                c43958rzBCopydefault.KWHzl.setVisibility(0);
                C42267rMn c42267rMn = c43958rzBCopydefault.KWHzl;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c42267rMn.EZpvd(fragmentActivityRequireActivity, (AbstractC42074rFj) null, freeTextAppModel);
            }
        }
    }

    public static final class Fragment extends RecyclerView.Adapter<PendingIntent> {
        public final int AEQbTJ;
        public final Function1<TaskDescription, Unit> EZpvd;
        public final int KWHzl;
        public java.util.List<? extends Dialog> OLrzqt;
        public final android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.util.List<? extends Dialog> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.rRH$TaskDescription, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(@NotNull android.content.Context context, @NotNull java.util.List<? extends Dialog> list, @NotNull Function1<? super TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = context;
            this.OLrzqt = list;
            this.EZpvd = function1;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(C43662rtX.Application.DbNXlk, typedValue, true);
            this.AEQbTJ = ContextCompat.getColor(context, typedValue.resourceId);
            context.getTheme().resolveAttribute(C43662rtX.Application.EZpvd, typedValue, true);
            this.KWHzl = ContextCompat.getColor(context, typedValue.resourceId);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public PendingIntent onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43960rzD c43960rzDAEQbTJ = C43960rzD.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c43960rzDAEQbTJ, "");
            if (i == 0) {
                return new ActionBar(this.copydefault, c43960rzDAEQbTJ);
            }
            if (i == 2) {
                return new LoaderManager(this.copydefault, c43960rzDAEQbTJ, new Function1() { // from class: o.rRI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rRH.Fragment.copydefault(this.AEQbTJ, (rRH.TaskDescription) obj);
                    }
                });
            }
            return new Activity(c43960rzDAEQbTJ, this.AEQbTJ, this.KWHzl, new Function1() { // from class: o.rRM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rRH.Fragment.EZpvd(this.AEQbTJ, (rRH.TaskDescription) obj);
                }
            });
        }

        public static final Unit copydefault(Fragment fragment, TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            fragment.EZpvd.invoke(taskDescription);
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(Fragment fragment, TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            fragment.EZpvd.invoke(taskDescription);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull PendingIntent pendingIntent, int i) {
            Intrinsics.checkNotNullParameter(pendingIntent, "");
            Dialog dialog = this.OLrzqt.get(i);
            if (dialog != null) {
                if (pendingIntent instanceof ActionBar) {
                    ((ActionBar) pendingIntent).copydefault(dialog);
                } else if (pendingIntent instanceof LoaderManager) {
                    ((LoaderManager) pendingIntent).OLrzqt(dialog);
                } else {
                    ((Activity) pendingIntent).EZpvd(dialog);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i < this.OLrzqt.size() && (this.OLrzqt.get(i) instanceof StateListAnimator)) {
                return 0;
            }
            if (i < this.OLrzqt.size() && (this.OLrzqt.get(i) instanceof TaskDescription)) {
                Dialog dialog = this.OLrzqt.get(i);
                Intrinsics.copydefault(dialog, "");
                if (Intrinsics.EZpvd(((TaskDescription) dialog).fARcdN(), java.lang.Boolean.TRUE)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public static final class StateListAnimator extends Dialog {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HeaderModel(name=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    public static final class TaskDescription extends Dialog {
        public final java.util.List<java.lang.String> AEQbTJ;
        public final java.util.List<java.lang.String> AYXKKw;
        public final java.lang.String AhwBna;
        public final java.util.List<java.lang.String> AkhnZx;
        public final java.lang.String AuCTel;
        public PictureMeta DbNXlk;
        public final java.lang.Boolean EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public java.lang.Boolean copydefault;
        public java.lang.Boolean djBIcL;
        public final java.lang.String ejfBZ;
        public final java.lang.String fARcdN;
        public final java.lang.String fJNWhG;
        public ChoiceReminder fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public java.util.List<java.lang.String> isConnected;
        public java.lang.Boolean valueOf;
        public boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChoiceReminder AhwBna() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, boolean z, boolean z2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.Boolean bool, java.lang.Boolean bool2, java.util.List<java.lang.String> list3, ChoiceReminder choiceReminder, java.util.List<java.lang.String> list4, java.lang.String str6, java.lang.String str7, java.lang.Boolean bool3, PictureMeta pictureMeta, java.lang.Boolean bool4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new TaskDescription(str, str2, str3, str4, str5, z, z2, list, list2, bool, bool2, list3, choiceReminder, list4, str6, str7, bool3, pictureMeta, bool4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.values = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) taskDescription.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) taskDescription.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) taskDescription.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) taskDescription.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskDescription.gEmmrt) && this.KWHzl == taskDescription.KWHzl && this.values == taskDescription.values && Intrinsics.EZpvd(this.AYXKKw, taskDescription.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, taskDescription.valueOf) && Intrinsics.EZpvd(this.djBIcL, taskDescription.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, taskDescription.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, taskDescription.fetchVPNInfo) && Intrinsics.EZpvd(this.isConnected, taskDescription.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) taskDescription.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.DbNXlk, taskDescription.DbNXlk) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean fARcdN() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fIwbmz() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean fJNWhG() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.fJNWhG.hashCode();
            java.lang.String str = this.AuCTel;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AhwBna;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            int iHashCode4 = this.ejfBZ.hashCode();
            java.lang.String str3 = this.gEmmrt;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            int iHashCode6 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode7 = java.lang.Boolean.hashCode(this.values);
            java.util.List<java.lang.String> list = this.AYXKKw;
            int iHashCode8 = list == null ? 0 : list.hashCode();
            java.util.List<java.lang.String> list2 = this.AEQbTJ;
            int iHashCode9 = list2 == null ? 0 : list2.hashCode();
            java.lang.Boolean bool = this.valueOf;
            int iHashCode10 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.djBIcL;
            int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
            java.util.List<java.lang.String> list3 = this.AkhnZx;
            int iHashCode12 = list3 == null ? 0 : list3.hashCode();
            ChoiceReminder choiceReminder = this.fetchVPNInfo;
            int iHashCode13 = choiceReminder == null ? 0 : choiceReminder.hashCode();
            java.util.List<java.lang.String> list4 = this.isConnected;
            int iHashCode14 = list4 == null ? 0 : list4.hashCode();
            java.lang.String str4 = this.fARcdN;
            int iHashCode15 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.OLrzqt;
            int iHashCode16 = str5 == null ? 0 : str5.hashCode();
            java.lang.Boolean bool3 = this.EZpvd;
            int iHashCode17 = bool3 == null ? 0 : bool3.hashCode();
            PictureMeta pictureMeta = this.DbNXlk;
            int iHashCode18 = pictureMeta == null ? 0 : pictureMeta.hashCode();
            java.lang.Boolean bool4 = this.copydefault;
            return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (bool4 == null ? 0 : bool4.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ContentViewModel(text=" + this.fJNWhG + ", tip=" + this.AuCTel + ", icon=" + this.AhwBna + ", value=" + this.ejfBZ + ", helperText=" + this.gEmmrt + ", enabled=" + this.KWHzl + ", isSelected=" + this.values + ", hiddenItemIds=" + this.AYXKKw + ", displayedItemIds=" + this.AEQbTJ + ", isCustomItem=" + this.valueOf + ", isHasResult=" + this.djBIcL + ", searchKey=" + this.AkhnZx + ", reminder=" + this.fetchVPNInfo + ", picture=" + this.isConnected + ", thumbnail=" + this.fARcdN + ", countryFlagUrl=" + this.OLrzqt + ", display=" + this.EZpvd + ", pictureMeta=" + this.DbNXlk + ", hasArrow=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureMeta valueOf() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009f: CONSTRUCTOR 
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r31v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r32v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r35v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder:?: TERNARY null = ((wrap:int:0x004f: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder) : (r36v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0058: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r37v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (32768 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (65536 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r40v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta:?: TERNARY null = ((wrap:int:0x0083: ARITH (131072 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta) : (r41v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0092: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r42v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.util.List<java.lang.String>, com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta, java.lang.Boolean):void (m)] (LINE:558) call: o.rRH.TaskDescription.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceReminder, java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PictureMeta, java.lang.Boolean):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, java.util.List list, java.util.List list2, java.lang.Boolean bool, java.lang.Boolean bool2, java.util.List list3, ChoiceReminder choiceReminder, java.util.List list4, java.lang.String str6, java.lang.String str7, java.lang.Boolean bool3, PictureMeta pictureMeta, java.lang.Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : choiceReminder, (i & 8192) != 0 ? null : list4, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : str7, (65536 & i) != 0 ? java.lang.Boolean.FALSE : bool3, (131072 & i) != 0 ? null : pictureMeta, (i & 262144) != 0 ? java.lang.Boolean.FALSE : bool4);
        }

        public TaskDescription(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, boolean z, boolean z2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.Boolean bool, java.lang.Boolean bool2, java.util.List<java.lang.String> list3, ChoiceReminder choiceReminder, java.util.List<java.lang.String> list4, java.lang.String str6, java.lang.String str7, java.lang.Boolean bool3, PictureMeta pictureMeta, java.lang.Boolean bool4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.fJNWhG = str;
            this.AuCTel = str2;
            this.AhwBna = str3;
            this.ejfBZ = str4;
            this.gEmmrt = str5;
            this.KWHzl = z;
            this.values = z2;
            this.AYXKKw = list;
            this.AEQbTJ = list2;
            this.valueOf = bool;
            this.djBIcL = bool2;
            this.AkhnZx = list3;
            this.fetchVPNInfo = choiceReminder;
            this.isConnected = list4;
            this.fARcdN = str6;
            this.OLrzqt = str7;
            this.EZpvd = bool3;
            this.DbNXlk = pictureMeta;
            this.copydefault = bool4;
        }

        public final int copydefault(@NotNull java.lang.String str, @NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            boolean zAYXKKw = C59449zhJ.AYXKKw(this.fJNWhG, str, true);
            boolean zAYXKKw2 = C59449zhJ.AYXKKw(taskDescription.fJNWhG, str, true);
            if (zAYXKKw && !zAYXKKw2) {
                return -1;
            }
            if (zAYXKKw || !zAYXKKw2) {
                return C59449zhJ.OLrzqt(this.fJNWhG, taskDescription.fJNWhG, true);
            }
            return 1;
        }
    }

    public static final class LoaderManager extends PendingIntent {
        public final android.content.Context AEQbTJ;
        public final C43960rzD EZpvd;
        public final Function1<TaskDescription, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.rRH$TaskDescription, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(@NotNull android.content.Context context, @NotNull C43960rzD c43960rzD, @NotNull Function1<? super TaskDescription, Unit> function1) {
            super(c43960rzD);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c43960rzD, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = context;
            this.EZpvd = c43960rzD;
            this.KWHzl = function1;
        }

        public void OLrzqt(@NotNull final Dialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "");
            TaskDescription taskDescription = (TaskDescription) dialog;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.AEQbTJ.getTheme().resolveAttribute(C43662rtX.Application.AYXKKw, typedValue, true);
            this.EZpvd.fetchVPNInfo.setBackgroundResource(typedValue.resourceId);
            this.EZpvd.fetchVPNInfo.setVisibility(0);
            if (taskDescription.fIwbmz()) {
                this.EZpvd.ejfBZ.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.RKDWNf));
                android.widget.TextView textView = this.EZpvd.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                OLrzqt(textView, this.AEQbTJ, C43662rtX.Activity.QVAiDq, false);
                this.EZpvd.AkhnZx.setText(taskDescription.values());
            } else {
                this.EZpvd.ejfBZ.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.QkdxfA));
                android.widget.TextView textView2 = this.EZpvd.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                OLrzqt(textView2, this.AEQbTJ, C52761wXj.TaskDescription.QWpYiD, true);
                this.EZpvd.AkhnZx.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.OBJEWx), C56423yEv.EZpvd(C56390yDp.OLrzqt("name", taskDescription.values()))));
            }
            this.EZpvd.isConnected.setVisibility(Intrinsics.EZpvd(taskDescription.fJNWhG(), java.lang.Boolean.TRUE) ? 8 : 0);
            this.EZpvd.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.rRQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rRH.LoaderManager.AEQbTJ(this.AEQbTJ, dialog, view);
                }
            });
        }

        public static final void AEQbTJ(LoaderManager loaderManager, Dialog dialog, android.view.View view) {
            Function1<TaskDescription, Unit> function1 = loaderManager.KWHzl;
            TaskDescription taskDescription = (TaskDescription) dialog;
            java.lang.String strValues = taskDescription.values();
            java.lang.String strAkhnZx = taskDescription.AkhnZx();
            java.lang.String strValues2 = taskDescription.values();
            java.lang.String strDjBIcL = taskDescription.djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            function1.invoke(new TaskDescription(strValues, strAkhnZx, null, strValues2, strDjBIcL, true, true, null, null, java.lang.Boolean.TRUE, null, null, null, null, null, null, null, null, null, 523648, null));
        }

        public final void OLrzqt(android.widget.TextView textView, android.content.Context context, @androidx.annotation.DrawableRes int i, boolean z) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i, null);
            if (z) {
                DrawableCompat.setTint(drawable, C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        }
    }

    public static final class ActionBar extends PendingIntent {
        public final android.content.Context EZpvd;
        public final C43960rzD KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.content.Context context, @NotNull C43960rzD c43960rzD) {
            super(c43960rzD);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c43960rzD, "");
            this.EZpvd = context;
            this.KWHzl = c43960rzD;
        }

        public void copydefault(@NotNull Dialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "");
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.EZpvd.getTheme().resolveAttribute(C43662rtX.Application.AYXKKw, typedValue, true);
            this.KWHzl.DbNXlk.setBackgroundResource(typedValue.resourceId);
            this.KWHzl.AhwBna.setVisibility(0);
            this.KWHzl.AhwBna.setText(((StateListAnimator) dialog).KWHzl());
        }
    }

    public static final class Activity extends PendingIntent {
        public final int AEQbTJ;
        public final Function1<TaskDescription, Unit> EZpvd;
        public final int KWHzl;
        public final C43960rzD OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.rRH$TaskDescription, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull C43960rzD c43960rzD, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @NotNull Function1<? super TaskDescription, Unit> function1) {
            super(c43960rzD);
            Intrinsics.checkNotNullParameter(c43960rzD, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = c43960rzD;
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.EZpvd = function1;
        }

        public void EZpvd(@NotNull final Dialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "");
            TaskDescription taskDescription = (TaskDescription) dialog;
            this.OLrzqt.OLrzqt.setVisibility(0);
            if (taskDescription.AEQbTJ()) {
                this.OLrzqt.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rRK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        rRH.Activity.OLrzqt(this.EZpvd, dialog, view);
                    }
                });
                this.OLrzqt.valueOf.setTextColor(this.AEQbTJ);
            } else {
                this.OLrzqt.OLrzqt.setOnClickListener(null);
                this.OLrzqt.valueOf.setTextColor(this.KWHzl);
            }
            java.lang.Boolean boolOLrzqt = taskDescription.OLrzqt();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(boolOLrzqt, bool) && C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.isConnected())) {
                this.OLrzqt.gEmmrt.setVisibility(0);
                java.lang.String strKWHzl = C55297xhL.KWHzl(taskDescription.isConnected(), "lfit", C55298xhM.dp2px$default(40.0f, null, 1, null), C55298xhM.dp2px$default(62.0f, null, 1, null));
                if (strKWHzl == null) {
                    strKWHzl = taskDescription.isConnected();
                }
                Intrinsics.copydefault(Glide.AEQbTJ(this.OLrzqt.gEmmrt.getContext()).EZpvd(strKWHzl).KWHzl(C43662rtX.Activity.QOLQEE).copydefault(C43662rtX.Activity.QOLQEE).EZpvd(this.OLrzqt.gEmmrt));
            } else {
                this.OLrzqt.gEmmrt.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) taskDescription.copydefault()) && C33129mqd.OLrzqt((java.lang.CharSequence) C43386roM.EZpvd.EZpvd())) {
                this.OLrzqt.AEQbTJ.setVisibility(0);
                C42513rVq c42513rVq = this.OLrzqt.AEQbTJ;
                java.lang.String strCopydefault = taskDescription.copydefault();
                c42513rVq.setData(strCopydefault != null ? strCopydefault : "");
            } else {
                this.OLrzqt.AEQbTJ.setVisibility(8);
            }
            if (taskDescription.fIwbmz()) {
                this.OLrzqt.EZpvd.setVisibility(0);
            } else {
                this.OLrzqt.EZpvd.setVisibility(8);
            }
            if (Intrinsics.EZpvd(taskDescription.KWHzl(), bool)) {
                this.OLrzqt.copydefault.setVisibility(0);
            } else {
                this.OLrzqt.copydefault.setVisibility(8);
            }
            this.OLrzqt.valueOf.setText(taskDescription.values());
            java.lang.String strGEmmrt = taskDescription.gEmmrt();
            if (strGEmmrt != null && strGEmmrt.length() != 0) {
                this.OLrzqt.KWHzl.setVisibility(0);
                this.OLrzqt.KWHzl.setText(taskDescription.gEmmrt());
            } else {
                this.OLrzqt.KWHzl.setVisibility(8);
            }
            java.lang.String strAkhnZx = taskDescription.AkhnZx();
            if (strAkhnZx != null && strAkhnZx.length() != 0) {
                this.OLrzqt.djBIcL.setVisibility(0);
                this.OLrzqt.djBIcL.setText(taskDescription.AkhnZx());
            } else {
                this.OLrzqt.djBIcL.setVisibility(8);
            }
        }

        public static final void OLrzqt(Activity activity, Dialog dialog, android.view.View view) {
            activity.EZpvd.invoke(dialog);
        }
    }

    public static abstract class PendingIntent extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull C43960rzD c43960rzD) {
            super(c43960rzD.getRoot());
            Intrinsics.checkNotNullParameter(c43960rzD, "");
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rRH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
