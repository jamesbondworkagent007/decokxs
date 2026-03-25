package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.uilab.edit.OKEditText;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.pKK;
import o.pOG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pOG extends AbstractActivityC38191pPp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public android.widget.TextView AhwBna;
    public Activity EZpvd;
    public android.widget.TextView OLrzqt;
    public RecyclerView copydefault;
    public C55230xfy gEmmrt;
    public android.widget.TextView valueOf;
    public final java.util.List<pOH> AEQbTJ = new java.util.ArrayList();
    public final java.util.List<pOH> djBIcL = new java.util.ArrayList();
    public final java.lang.String AYXKKw = (java.lang.String) yDV.AubY(C34704nhP.copydefault.KWHzl());

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pOG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractActivityC38191pPp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pKK.ActionBar.AEQbTJ);
        this.OLrzqt = (android.widget.TextView) findViewById(pKK.StateListAnimator.AYXKKw);
        this.valueOf = (android.widget.TextView) findViewById(pKK.StateListAnimator.fIwbmz);
        this.AhwBna = (android.widget.TextView) findViewById(pKK.StateListAnimator.AkhnZx);
        android.widget.TextView textView = this.valueOf;
        C55230xfy c55230xfy = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.pON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pOG.OLrzqt(this.KWHzl, view);
            }
        });
        android.widget.TextView textView2 = this.AhwBna;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
            textView2 = null;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pOG.copydefault(this.EZpvd, view);
            }
        });
        ((android.widget.ImageView) findViewById(pKK.StateListAnimator.DbNXlk)).setOnClickListener(new View.OnClickListener() { // from class: o.pOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pOG.djBIcL(this.OLrzqt, view);
            }
        });
        this.gEmmrt = (C55230xfy) findViewById(pKK.StateListAnimator.getNewProxyInstance);
        this.copydefault = (RecyclerView) findViewById(pKK.StateListAnimator.djBIcL);
        C55230xfy c55230xfy2 = this.gEmmrt;
        if (c55230xfy2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c55230xfy = c55230xfy2;
        }
        c55230xfy.EZpvd().addTextChangedListener(new Application());
        OLrzqt();
    }

    public static final void OLrzqt(pOG pog, android.view.View view) {
        showEditTextDialog$default(pog, pog, false, 2, null);
    }

    public static final void copydefault(pOG pog, android.view.View view) {
        pog.EZpvd((android.content.Context) pog, true);
    }

    public static final void djBIcL(pOG pog, android.view.View view) {
        pog.finish();
    }

    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            pOG.this.AEQbTJ(java.lang.String.valueOf(editable));
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        this.djBIcL.clear();
        if (str.length() == 0) {
            this.djBIcL.addAll(this.AEQbTJ);
        } else {
            for (pOH poh : this.AEQbTJ) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) poh.OLrzqt(), (java.lang.CharSequence) str, true)) {
                    this.djBIcL.add(poh);
                }
            }
        }
        Activity activity = this.EZpvd;
        if (activity != null) {
            activity.notifyDataSetChanged();
        }
    }

    public final void OLrzqt() {
        this.AEQbTJ.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<java.lang.String, InterfaceC43233rlS> mapCopydefault = C43239rlY.AEQbTJ.copydefault();
        java.util.Iterator<T> it = mapCopydefault.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC43233rlS interfaceC43233rlS = mapCopydefault.get((java.lang.String) it.next());
            if (interfaceC43233rlS != null) {
                if (linkedHashMap.containsKey(interfaceC43233rlS.OLrzqt())) {
                    pOH poh = (pOH) linkedHashMap.get(interfaceC43233rlS.OLrzqt());
                    if (poh != null) {
                        poh.KWHzl().add(interfaceC43233rlS.KWHzl().getMode());
                        if (poh.KWHzl().contains(DeeplinkMode.PRO.getMode()) && poh.KWHzl().contains(DeeplinkMode.LITE.getMode()) && !poh.KWHzl().contains("exchange")) {
                            poh.KWHzl().add("exchange");
                        }
                    }
                } else {
                    pOH poh2 = new pOH(interfaceC43233rlS.OLrzqt(), yDY.AhwBna(interfaceC43233rlS.KWHzl().getMode()), interfaceC43233rlS.copydefault(), null, interfaceC43233rlS.AEQbTJ(), 8, null);
                    linkedHashMap.put(interfaceC43233rlS.OLrzqt(), poh2);
                    this.AEQbTJ.add(poh2);
                }
            }
        }
        C55230xfy c55230xfy = this.gEmmrt;
        android.widget.TextView textView = null;
        if (c55230xfy == null) {
            Intrinsics.gEmmrt("");
            c55230xfy = null;
        }
        AEQbTJ(java.lang.String.valueOf(c55230xfy.KWHzl().getText()));
        RecyclerView recyclerView = this.copydefault;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.EZpvd = new Activity(this.djBIcL, new Function1() { // from class: o.pOQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pOG.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.pOR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pOG.OLrzqt(this.AEQbTJ, (pOH) obj);
            }
        }, this.AYXKKw);
        RecyclerView recyclerView2 = this.copydefault;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.EZpvd);
        RecyclerView recyclerView3 = this.copydefault;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new C57593ylO(10, false, false, 6, null));
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView2;
        }
        textView.setText("Total Deeplinks: " + this.AEQbTJ.size());
    }

    public static final Unit KWHzl(pOG pog, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pog.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(pOG pog, pOH poh) {
        Intrinsics.checkNotNullParameter(poh, "");
        pog.AEQbTJ(pog, poh);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        if (str.length() == 0) {
            C33134mqi.copydefault(this, "Invalid Deeplink Value");
        } else {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), this, str, null, new Function1() { // from class: o.pOS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pOG.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void OLrzqt(java.lang.String str) {
        ((pKD) C43251rlk.copydefault(pKD.class)).AEQbTJ(this, str);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity extends RecyclerView.Adapter<StateListAnimator> {
        public final Function1<java.lang.String, Unit> EZpvd;
        public final java.util.List<pOH> KWHzl;
        public final java.lang.String OLrzqt;
        public final Function1<pOH, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.pOH, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull java.util.List<pOH> list, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super pOH, Unit> function12, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = list;
            this.EZpvd = function1;
            this.copydefault = function12;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(pKK.ActionBar.AhwBna, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            stateListAnimator.EZpvd(this.KWHzl.get(i), this.EZpvd, this.copydefault, this.OLrzqt);
        }

        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public final android.widget.LinearLayout AEQbTJ;
            public final android.widget.LinearLayout AhwBna;
            public final C55251xgS EZpvd;
            public final android.widget.TextView KWHzl;
            public final C55251xgS OLrzqt;
            public final C55251xgS copydefault;
            public final android.widget.TextView gEmmrt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                android.view.View viewFindViewById = view.findViewById(pKK.StateListAnimator.AuCTelauCTel);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.gEmmrt = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(pKK.StateListAnimator.fARcdN);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.copydefault = (C55251xgS) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(pKK.StateListAnimator.ejfBZ);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.OLrzqt = (C55251xgS) viewFindViewById3;
                android.view.View viewFindViewById4 = view.findViewById(pKK.StateListAnimator.copydefault);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.EZpvd = (C55251xgS) viewFindViewById4;
                android.view.View viewFindViewById5 = view.findViewById(pKK.StateListAnimator.OLrzqt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
                this.KWHzl = (android.widget.TextView) viewFindViewById5;
                android.view.View viewFindViewById6 = view.findViewById(pKK.StateListAnimator.AuCTel);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
                this.AEQbTJ = (android.widget.LinearLayout) viewFindViewById6;
                android.view.View viewFindViewById7 = view.findViewById(pKK.StateListAnimator.hDKMBd);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
                this.AhwBna = (android.widget.LinearLayout) viewFindViewById7;
            }

            public final void EZpvd(@NotNull final pOH poh, @NotNull final Function1<? super java.lang.String, Unit> function1, @NotNull final Function1<? super pOH, Unit> function12, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(poh, "");
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(function12, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.gEmmrt.setText(poh.OLrzqt());
                C55251xgS c55251xgS = this.copydefault;
                java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(poh.KWHzl());
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String upperCase = str2.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                c55251xgS.setText(upperCase);
                this.copydefault.setOKDSStyle(copydefault((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(poh.KWHzl())));
                if (poh.KWHzl().size() > 1) {
                    java.lang.String str3 = poh.KWHzl().get(1);
                    C55251xgS c55251xgS2 = this.OLrzqt;
                    java.lang.String upperCase2 = str3.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    c55251xgS2.setText(upperCase2);
                    this.OLrzqt.setVisibility(0);
                    this.OLrzqt.setOKDSStyle(copydefault(str3));
                } else {
                    this.OLrzqt.setVisibility(8);
                }
                this.EZpvd.setText(poh.copydefault() ? "Login Required" : "");
                this.EZpvd.setVisibility(poh.copydefault() ? 0 : 8);
                this.AEQbTJ.removeAllViews();
                for (java.lang.String str4 : poh.KWHzl()) {
                    android.widget.TextView textView = new android.widget.TextView(this.AEQbTJ.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, 10, 0, 10);
                    textView.setLayoutParams(layoutParams);
                    final java.lang.String str5 = str + "://" + str4 + "/" + poh.OLrzqt();
                    android.text.SpannableString spannableString = new android.text.SpannableString(str5);
                    spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 0);
                    textView.setText(spannableString);
                    textView.setTextColor(this.AEQbTJ.getContext().getColor(C52761wXj.Activity.DcMfJKDSqxTE));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: o.pOP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            pOG.Activity.StateListAnimator.AEQbTJ(str5, poh, function1, view);
                        }
                    });
                    textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.pOT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(android.view.View view) {
                            return pOG.Activity.StateListAnimator.OLrzqt(str5, poh, view);
                        }
                    });
                    this.AEQbTJ.addView(textView);
                }
                this.AhwBna.removeAllViews();
                this.AhwBna.setVisibility(poh.AEQbTJ().isEmpty() ^ true ? 0 : 8);
                for (java.lang.String str6 : poh.AEQbTJ().keySet()) {
                    android.content.Context context = this.AhwBna.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    final pPO ppo = new pPO(context);
                    ppo.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    java.lang.String str7 = poh.AEQbTJ().get(str6);
                    if (str7 == null) {
                        str7 = "";
                    }
                    ppo.setup(str6, str7, new Function1() { // from class: o.pOX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return pOG.Activity.StateListAnimator.KWHzl(poh, this, ppo, (java.lang.String) obj);
                        }
                    });
                    this.AhwBna.addView(ppo);
                }
                this.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pOY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        pOG.Activity.StateListAnimator.KWHzl(function12, poh, view);
                    }
                });
            }

            public static final void AEQbTJ(java.lang.String str, pOH poh, Function1 function1, android.view.View view) {
                java.lang.String str2 = str + "?";
                for (java.lang.String str3 : poh.AEQbTJ().keySet()) {
                    str2 = ((java.lang.Object) str2) + str3 + ContainerUtils.KEY_VALUE_DELIMITER + ((java.lang.Object) poh.AEQbTJ().get(str3)) + ContainerUtils.FIELD_DELIMITER;
                }
                function1.invoke(str2);
            }

            public static final boolean OLrzqt(java.lang.String str, pOH poh, android.view.View view) {
                java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
                android.content.ClipboardManager clipboardManager = objEZpvd instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) objEZpvd : null;
                if (clipboardManager == null) {
                    return true;
                }
                java.lang.String str2 = str + "?";
                for (java.lang.String str3 : poh.AEQbTJ().keySet()) {
                    str2 = ((java.lang.Object) str2) + str3 + ContainerUtils.KEY_VALUE_DELIMITER + ((java.lang.Object) poh.AEQbTJ().get(str3)) + ContainerUtils.FIELD_DELIMITER;
                }
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str2));
                return true;
            }

            public static final Unit KWHzl(pOH poh, StateListAnimator stateListAnimator, pPO ppo, java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                poh.AEQbTJ().remove(str);
                stateListAnimator.AhwBna.removeView(ppo);
                return Unit.INSTANCE;
            }

            public static final void KWHzl(Function1 function1, pOH poh, android.view.View view) {
                function1.invoke(poh);
            }

            public final int copydefault(java.lang.String str) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DeeplinkMode.PRO.getMode())) {
                    return 3;
                }
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DeeplinkMode.LITE.getMode())) {
                    return 1;
                }
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) DeeplinkMode.APP.getMode())) {
                    return 4;
                }
                return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "exchange") ? 2 : 0;
            }
        }
    }

    public static /* synthetic */ void showEditTextDialog$default(pOG pog, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pog.EZpvd(context, z);
    }

    public final void EZpvd(android.content.Context context, final boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(z ? "Enter Link" : "Enter Deeplink");
        final OKEditText oKEditText = new OKEditText(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(10, 0, 10, 0);
        oKEditText.setLayoutParams(layoutParams);
        oKEditText.setHint(z ? "Enter Link Here" : "Enter deeplink here");
        builder.setView(oKEditText);
        builder.setPositiveButton("Launch Deeplink", new DialogInterface.OnClickListener() { // from class: o.pOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                pOG.copydefault(z, this, oKEditText, dialogInterface, i);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: o.pOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                pOG.EZpvd(dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public static final void copydefault(boolean z, pOG pog, OKEditText oKEditText, android.content.DialogInterface dialogInterface, int i) {
        if (z) {
            pog.OLrzqt(java.lang.String.valueOf(oKEditText.getText()));
        } else {
            pog.EZpvd(java.lang.String.valueOf(oKEditText.getText()));
        }
        dialogInterface.cancel();
    }

    public static final void EZpvd(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    public final void AEQbTJ(final android.content.Context context, final pOH poh) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Enter Key-Value Pairs for Deeplink");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        final OKEditText oKEditText = new OKEditText(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(10, 0, 10, 0);
        oKEditText.setMaxLines(1);
        oKEditText.setKeyListener(android.text.method.DigitsKeyListener.getInstance("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,_-:/"));
        oKEditText.setRawInputType(1);
        oKEditText.setLayoutParams(layoutParams);
        oKEditText.setHint("Key");
        linearLayout.addView(oKEditText);
        final OKEditText oKEditText2 = new OKEditText(context, null, 0, 6, null);
        oKEditText2.setHint("Value");
        oKEditText2.setMaxLines(1);
        oKEditText2.setKeyListener(android.text.method.DigitsKeyListener.getInstance("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,_-:/"));
        oKEditText2.setRawInputType(1);
        oKEditText2.setLayoutParams(layoutParams);
        linearLayout.addView(oKEditText2);
        builder.setView(linearLayout);
        builder.setPositiveButton("Add More", new DialogInterface.OnClickListener() { // from class: o.pOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                pOG.copydefault(oKEditText, oKEditText2, poh, this, context, dialogInterface, i);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: o.pOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                pOG.KWHzl(dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public static final void copydefault(OKEditText oKEditText, OKEditText oKEditText2, pOH poh, pOG pog, android.content.Context context, android.content.DialogInterface dialogInterface, int i) {
        java.lang.String strValueOf = java.lang.String.valueOf(oKEditText.getText());
        java.lang.String strValueOf2 = java.lang.String.valueOf(oKEditText2.getText());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf) && C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf2)) {
            poh.AEQbTJ().put(strValueOf, strValueOf2);
            Activity activity = pog.EZpvd;
            if (activity != null) {
                activity.notifyDataSetChanged();
            }
            pog.AEQbTJ(context, poh);
            return;
        }
        C33134mqi.copydefault(pog, "Invalid Values");
    }

    public static final void KWHzl(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    @Override // o.AbstractActivityC38191pPp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38191pPp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC38191pPp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC38191pPp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
