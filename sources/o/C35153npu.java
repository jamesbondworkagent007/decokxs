package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_find.data.RankTag;
import com.okinc.unify_find.data.RankTagPlate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC41076qjw;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35153npu extends android.widget.LinearLayout implements InterfaceC43034rhf {
    public final java.lang.String AEQbTJ;
    public android.view.ViewGroup EZpvd;
    public C55505xlH KWHzl;
    public java.util.ArrayList<RankTagPlate> OLrzqt;
    public InterfaceC58217yxC copydefault;

    public C35153npu(android.content.Context context) {
        super(context);
        this.KWHzl = new C55505xlH();
        this.AEQbTJ = "RANK_HOT_TYPE";
    }

    public C35153npu(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = new C55505xlH();
        this.AEQbTJ = "RANK_HOT_TYPE";
    }

    public C35153npu(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = new C55505xlH();
        this.AEQbTJ = "RANK_HOT_TYPE";
    }

    public final void OLrzqt(@NotNull RankTag rankTag, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(rankTag, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = copydefault(rankTag);
        android.view.ViewGroup viewGroup = this.EZpvd;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        java.util.ArrayList<RankTagPlate> arrayList = this.OLrzqt;
        if (arrayList != null) {
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                final RankTagPlate rankTagPlate = (RankTagPlate) obj;
                if (Intrinsics.EZpvd((java.lang.Object) rankTagPlate.getType(), (java.lang.Object) this.AEQbTJ)) {
                    android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.AuCTel, this.EZpvd, false);
                    android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(qZH.StateListAnimator.ddhgMB);
                    if (textView != null) {
                        textView.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.GQzpsZgQzpsZ), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, rankTagPlate.getCode()))));
                    }
                    android.view.ViewGroup viewGroup2 = this.EZpvd;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(viewInflate);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(qZH.StateListAnimator.ITrustedWebActivityCallbackDefault);
                    java.util.ArrayList<RankTagPlate> arrayList2 = this.OLrzqt;
                    textView2.setVisibility((arrayList2 == null || i != arrayList2.size() + (-1)) ? 0 : 8);
                    if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames()) {
                        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.npv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C35153npu.OLrzqt(this.copydefault, str, str2, rankTagPlate, view);
                            }
                        });
                    }
                } else {
                    android.view.View viewInflate2 = android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.fIwbmz, this.EZpvd, false);
                    android.widget.TextView textView3 = (android.widget.TextView) viewInflate2.findViewById(qZH.StateListAnimator.validateSHA256);
                    if (textView3 != null) {
                        textView3.setText(java.lang.String.valueOf(rankTagPlate.getName()));
                    }
                    android.widget.TextView textView4 = (android.widget.TextView) viewInflate2.findViewById(qZH.StateListAnimator.ITrustedWebActivityCallbackDefault);
                    java.util.ArrayList<RankTagPlate> arrayList3 = this.OLrzqt;
                    textView4.setVisibility((arrayList3 == null || i != arrayList3.size() + (-1)) ? 0 : 8);
                    android.view.ViewGroup viewGroup3 = this.EZpvd;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(viewInflate2);
                    }
                    if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames()) {
                        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: o.nps
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C35153npu.AEQbTJ(this.copydefault, rankTagPlate, view);
                            }
                        });
                    }
                }
                i++;
            }
        }
    }

    public static final void OLrzqt(C35153npu c35153npu, final java.lang.String str, final java.lang.String str2, final RankTagPlate rankTagPlate, android.view.View view) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_k_rank_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.npw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35153npu.copydefault(str, str2, rankTagPlate, (EventParamsList) obj);
            }
        });
        android.content.Intent intent = new android.content.Intent(c35153npu.getContext(), (java.lang.Class<?>) ActivityC34993nmt.class);
        intent.putExtra("ranking_id", 0);
        intent.putExtra("ranking_biz_type", str);
        c35153npu.getContext().startActivity(intent);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, RankTagPlate rankTagPlate, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deal_type", str, false);
        eventParamsList.put("deal_name", str2, false);
        eventParamsList.put("rank", java.lang.String.valueOf(rankTagPlate != null ? rankTagPlate.getCode() : null), false);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C35153npu c35153npu, RankTagPlate rankTagPlate, android.view.View view) {
        ActivityC41076qjw.Activity activity = ActivityC41076qjw.Companion;
        android.content.Context context = c35153npu.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        activity.AEQbTJ(context, rankTagPlate.getCode(), rankTagPlate.getName());
    }

    public final java.util.ArrayList<RankTagPlate> copydefault(RankTag rankTag) {
        java.util.ArrayList<RankTagPlate> arrayList = new java.util.ArrayList<>();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) rankTag.getHotRank())) {
            RankTagPlate rankTagPlate = new RankTagPlate();
            rankTagPlate.setName(rankTag.getCoinName());
            rankTagPlate.setCode(rankTag.getHotRank());
            rankTagPlate.setType(this.AEQbTJ);
            arrayList.add(rankTagPlate);
        }
        java.util.ArrayList<RankTagPlate> plate = rankTag.getPlate();
        if (plate != null) {
            arrayList.addAll(plate);
        }
        return arrayList;
    }

    @Override // o.InterfaceC43034rhf
    public void OLrzqt(@NotNull android.view.ViewGroup viewGroup, @NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        addView(viewGroup, layoutParams);
        this.EZpvd = viewGroup;
    }

    /* JADX INFO: renamed from: o.npu$Application */
    public static final class Application implements InterfaceC55503xlF<java.util.ArrayList<RankTag>> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        @Override // o.InterfaceC55503xlF
        public void OLrzqt() {
        }

        public Application(java.lang.String str, java.lang.String str2, Function0<Unit> function0) {
            this.OLrzqt = str;
            this.copydefault = str2;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)V */
        @Override // o.InterfaceC55503xlF
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.util.ArrayList<RankTag> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            if (arrayList.size() > 0) {
                C35153npu c35153npu = C35153npu.this;
                RankTag rankTag = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(rankTag, "");
                c35153npu.OLrzqt(rankTag, this.OLrzqt, this.copydefault);
                Function0<Unit> function0 = this.AEQbTJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    @Override // o.InterfaceC43034rhf
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C55505xlH c55505xlH = this.KWHzl;
        this.copydefault = c55505xlH != null ? c55505xlH.EZpvd(str, str3, new Application(str2, str3, function0)) : null;
    }

    @Override // o.InterfaceC43034rhf
    public void copydefault() {
        C55505xlH c55505xlH = this.KWHzl;
        if (c55505xlH != null) {
            c55505xlH.copydefault();
        }
    }
}
