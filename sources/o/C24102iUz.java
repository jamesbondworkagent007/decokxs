package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.okinc.business.invest_biz.data.bean.AlertsHighlightsScoreInfo;
import com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo;
import com.okinc.business.invest_biz.data.bean.SecurityRadarScoreInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C24102iUz extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public AbstractC23827iKu AEQbTJ;
    public java.lang.String OLrzqt;

    /* JADX INFO: renamed from: o.iUz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C24102iUz KWHzl(SecurityDetailsInfo securityDetailsInfo) {
            C24102iUz c24102iUz = new C24102iUz();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("securityRating", securityDetailsInfo);
            c24102iUz.setArguments(bundle);
            return c24102iUz;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = AbstractC23827iKu.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        wxq.AYXKKw().setPaddingRelative(0, 0, 0, 0);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.valueOf));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55118xds root;
        android.graphics.drawable.Drawable background;
        java.util.List<java.lang.String> scoreList;
        java.util.List<java.lang.String> scoreList2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC23827iKu abstractC23827iKu = this.AEQbTJ;
        AbstractC23827iKu abstractC23827iKu2 = null;
        if (abstractC23827iKu == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu = null;
        }
        abstractC23827iKu.isConnected.setLayoutManager(new LinearLayoutManager(requireActivity()));
        AbstractC23827iKu abstractC23827iKu3 = this.AEQbTJ;
        if (abstractC23827iKu3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu3 = null;
        }
        abstractC23827iKu3.DbNXlk.setLayoutManager(new LinearLayoutManager(requireActivity()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.os.Bundle arguments = getArguments();
        SecurityDetailsInfo securityDetailsInfo = arguments != null ? (SecurityDetailsInfo) arguments.getParcelable("securityRating") : null;
        if (!(securityDetailsInfo instanceof SecurityDetailsInfo)) {
            securityDetailsInfo = null;
        }
        if (securityDetailsInfo != null) {
            this.OLrzqt = securityDetailsInfo.getWebsiteUrl();
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                AbstractC23827iKu abstractC23827iKu4 = this.AEQbTJ;
                if (abstractC23827iKu4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23827iKu4 = null;
                }
                android.widget.ImageView imageView = abstractC23827iKu4.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, securityDetailsInfo.getNightWebsiteLogo(), C25493ixk.StateListAnimator.EZpvd, C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
            } else {
                C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
                AbstractC23827iKu abstractC23827iKu5 = this.AEQbTJ;
                if (abstractC23827iKu5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23827iKu5 = null;
                }
                android.widget.ImageView imageView2 = abstractC23827iKu5.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C27569jxf.loadCircleWithBorder$default(c27569jxf2, imageView2, securityDetailsInfo.getWebsiteLogo(), C25493ixk.StateListAnimator.EZpvd, C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
            }
            AbstractC23827iKu abstractC23827iKu6 = this.AEQbTJ;
            if (abstractC23827iKu6 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu6 = null;
            }
            abstractC23827iKu6.AkhnZx.setText(securityDetailsInfo.getScoreExplain());
            AbstractC23827iKu abstractC23827iKu7 = this.AEQbTJ;
            if (abstractC23827iKu7 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu7 = null;
            }
            abstractC23827iKu7.hDKMBd.setText(securityDetailsInfo.getWebsiteName());
            AbstractC23827iKu abstractC23827iKu8 = this.AEQbTJ;
            if (abstractC23827iKu8 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu8 = null;
            }
            android.widget.TextView textView = abstractC23827iKu8.getFieldNames;
            int i = C52761wXj.ActionBar.DNMMPQ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            textView.setTextColor(C55366xib.KWHzl(i, contextRequireContext));
            AbstractC23827iKu abstractC23827iKu9 = this.AEQbTJ;
            if (abstractC23827iKu9 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu9 = null;
            }
            android.widget.TextView textView2 = abstractC23827iKu9.getFieldNames;
            AlertsHighlightsScoreInfo highlightsScore = securityDetailsInfo.getHighlightsScore();
            textView2.setText(highlightsScore != null ? highlightsScore.getGradingTitle() : null);
            AlertsHighlightsScoreInfo alertsScore = securityDetailsInfo.getAlertsScore();
            if (C59449zhJ.equals$default(alertsScore != null ? alertsScore.getGradingTitle() : null, "", false, 2, null)) {
                AbstractC23827iKu abstractC23827iKu10 = this.AEQbTJ;
                if (abstractC23827iKu10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23827iKu10 = null;
                }
                abstractC23827iKu10.uzCIH.setVisibility(8);
                AbstractC23827iKu abstractC23827iKu11 = this.AEQbTJ;
                if (abstractC23827iKu11 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23827iKu11 = null;
                }
                abstractC23827iKu11.DbNXlk.setVisibility(8);
            }
            AbstractC23827iKu abstractC23827iKu12 = this.AEQbTJ;
            if (abstractC23827iKu12 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu12 = null;
            }
            android.widget.TextView textView3 = abstractC23827iKu12.uzCIH;
            AlertsHighlightsScoreInfo alertsScore2 = securityDetailsInfo.getAlertsScore();
            textView3.setText(alertsScore2 != null ? alertsScore2.getGradingTitle() : null);
            arrayList.clear();
            AlertsHighlightsScoreInfo highlightsScore2 = securityDetailsInfo.getHighlightsScore();
            if (highlightsScore2 != null && (scoreList2 = highlightsScore2.getScoreList()) != null) {
                java.util.Iterator<T> it = scoreList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C23964iPw((java.lang.String) it.next()));
                }
            }
            AbstractC23827iKu abstractC23827iKu13 = this.AEQbTJ;
            if (abstractC23827iKu13 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu13 = null;
            }
            RecyclerView recyclerView = abstractC23827iKu13.isConnected;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
            AbstractC23827iKu abstractC23827iKu14 = this.AEQbTJ;
            if (abstractC23827iKu14 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu14 = null;
            }
            android.widget.TextView textView4 = abstractC23827iKu14.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
            arrayList2.clear();
            AlertsHighlightsScoreInfo alertsScore3 = securityDetailsInfo.getAlertsScore();
            if (alertsScore3 != null && (scoreList = alertsScore3.getScoreList()) != null) {
                java.util.Iterator<T> it2 = scoreList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C23964iPw((java.lang.String) it2.next()));
                }
            }
            AbstractC23827iKu abstractC23827iKu15 = this.AEQbTJ;
            if (abstractC23827iKu15 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu15 = null;
            }
            RecyclerView recyclerView2 = abstractC23827iKu15.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(arrayList2.isEmpty() ^ true ? 0 : 8);
            AbstractC23827iKu abstractC23827iKu16 = this.AEQbTJ;
            if (abstractC23827iKu16 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu16 = null;
            }
            android.widget.TextView textView5 = abstractC23827iKu16.uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(arrayList2.isEmpty() ^ true ? 0 : 8);
            AbstractC23827iKu abstractC23827iKu17 = this.AEQbTJ;
            if (abstractC23827iKu17 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu17 = null;
            }
            abstractC23827iKu17.isConnected.setAdapter(new iSU(arrayList));
            AbstractC23827iKu abstractC23827iKu18 = this.AEQbTJ;
            if (abstractC23827iKu18 == null) {
                Intrinsics.gEmmrt("");
                abstractC23827iKu18 = null;
            }
            abstractC23827iKu18.DbNXlk.setAdapter(new iSU(arrayList2));
            java.util.List<SecurityRadarScoreInfo> securityScores = securityDetailsInfo.getSecurityScores();
            if (securityScores != null) {
                AbstractC23827iKu abstractC23827iKu19 = this.AEQbTJ;
                if (abstractC23827iKu19 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23827iKu19 = null;
                }
                ConstraintLayout constraintLayout = abstractC23827iKu19.values;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                OLrzqt(securityScores, securityDetailsInfo.getSecurityScoreColor());
            }
            C54946xaf binding = getBinding();
            if (binding != null && (root = binding.getRoot()) != null && (background = root.getBackground()) != null) {
                C33057mpK.copydefault(background, C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
            }
        }
        AbstractC23827iKu abstractC23827iKu20 = this.AEQbTJ;
        if (abstractC23827iKu20 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu20 = null;
        }
        abstractC23827iKu20.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.iUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C24102iUz.AEQbTJ(this.OLrzqt, view2);
            }
        });
        AbstractC23827iKu abstractC23827iKu21 = this.AEQbTJ;
        if (abstractC23827iKu21 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23827iKu2 = abstractC23827iKu21;
        }
        C55258xgZ c55258xgZ = abstractC23827iKu2.hDKMBd;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
    }

    public static final void AEQbTJ(C24102iUz c24102iUz, android.view.View view) {
        c24102iUz.dismissAllowingStateLoss();
    }

    public final void OLrzqt(java.util.List<SecurityRadarScoreInfo> list, java.lang.String str) {
        AbstractC23827iKu abstractC23827iKu;
        android.content.Context contextRequireContext = requireContext();
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int color = ContextCompat.getColor(contextRequireContext, c27569jxf.copydefault(contextRequireContext2, str));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            abstractC23827iKu = null;
            android.graphics.drawable.Drawable drawable = null;
            if (!it.hasNext()) {
                break;
            }
            RadarEntry radarEntry = new RadarEntry(C33129mqd.djBIcL(((SecurityRadarScoreInfo) it.next()).getScore()));
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(requireContext(), C25493ixk.StateListAnimator.AhwBna);
            if (drawable2 != null) {
                drawable2.setTint(color);
                drawable = drawable2;
            }
            radarEntry.setIcon(drawable);
            arrayList.add(radarEntry);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SecurityRadarScoreInfo) it2.next()).getScoreName());
        }
        RadarDataSet radarDataSet = new RadarDataSet(arrayList, "");
        radarDataSet.setDrawValues(false);
        radarDataSet.setColor(color);
        radarDataSet.setLineWidth(2.0f);
        radarDataSet.setDrawFilled(true);
        radarDataSet.setHighlightEnabled(false);
        radarDataSet.setDrawIcons(false);
        android.widget.TextView[] textViewArr = new android.widget.TextView[6];
        AbstractC23827iKu abstractC23827iKu2 = this.AEQbTJ;
        if (abstractC23827iKu2 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu2 = null;
        }
        textViewArr[0] = abstractC23827iKu2.fARcdN;
        AbstractC23827iKu abstractC23827iKu3 = this.AEQbTJ;
        if (abstractC23827iKu3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu3 = null;
        }
        textViewArr[1] = abstractC23827iKu3.AuCTel;
        AbstractC23827iKu abstractC23827iKu4 = this.AEQbTJ;
        if (abstractC23827iKu4 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu4 = null;
        }
        textViewArr[2] = abstractC23827iKu4.ejfBZ;
        AbstractC23827iKu abstractC23827iKu5 = this.AEQbTJ;
        if (abstractC23827iKu5 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu5 = null;
        }
        textViewArr[3] = abstractC23827iKu5.fJNWhG;
        AbstractC23827iKu abstractC23827iKu6 = this.AEQbTJ;
        if (abstractC23827iKu6 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu6 = null;
        }
        textViewArr[4] = abstractC23827iKu6.fIwbmz;
        AbstractC23827iKu abstractC23827iKu7 = this.AEQbTJ;
        if (abstractC23827iKu7 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu7 = null;
        }
        textViewArr[5] = abstractC23827iKu7.getNewProxyInstance;
        int i = 0;
        for (java.lang.Object obj : yDY.gEmmrt(textViewArr)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.widget.TextView textView = (android.widget.TextView) obj;
            Intrinsics.copydefault(textView);
            KWHzl(textView, (java.lang.String) arrayList2.get(i), list.get(i).getScore());
            i++;
        }
        AbstractC23827iKu abstractC23827iKu8 = this.AEQbTJ;
        if (abstractC23827iKu8 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu8 = null;
        }
        abstractC23827iKu8.fetchVPNInfo.setData(new RadarData(radarDataSet));
        AbstractC23827iKu abstractC23827iKu9 = this.AEQbTJ;
        if (abstractC23827iKu9 == null) {
            Intrinsics.gEmmrt("");
            abstractC23827iKu9 = null;
        }
        C27465jvh c27465jvh = abstractC23827iKu9.fetchVPNInfo;
        C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        c27465jvh.setupColors(c27569jxf2.copydefault(contextRequireContext3, str), c27569jxf2.copydefault(str), ContextCompat.getColor(requireContext(), C52761wXj.Activity.invokespecialDPHOMC));
        AbstractC23827iKu abstractC23827iKu10 = this.AEQbTJ;
        if (abstractC23827iKu10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23827iKu = abstractC23827iKu10;
        }
        C27465jvh c27465jvh2 = abstractC23827iKu.fetchVPNInfo;
        c27465jvh2.getXAxis().setDrawLabels(false);
        c27465jvh2.getYAxis().setDrawLabels(false);
        c27465jvh2.getYAxis().setAxisMinimum(0.0f);
        c27465jvh2.getYAxis().setAxisMaximum(100.0f);
        c27465jvh2.getYAxis().setLabelCount(2, true);
        c27465jvh2.setWebColor(ContextCompat.getColor(c27465jvh2.getContext(), C52761wXj.Activity.AwvSrB));
        c27465jvh2.setWebColorInner(ContextCompat.getColor(c27465jvh2.getContext(), C52761wXj.Activity.AwvSrB));
        c27465jvh2.getDescription().setEnabled(false);
        c27465jvh2.getLegend().setEnabled(false);
        c27465jvh2.setRotationEnabled(false);
    }

    /* JADX INFO: renamed from: o.iUz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C24102iUz EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C24102iUz c24102iUz) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c24102iUz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) throws java.io.UnsupportedEncodingException {
            android.content.Context context;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.OLrzqt) || (context = this.EZpvd.getContext()) == null) {
                    return;
                }
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                java.lang.String str = this.EZpvd.OLrzqt;
                if (str == null) {
                    str = "";
                }
                C27508jwX.openUrl$default(c27508jwX, context, str, false, 2, null);
            }
        }
    }

    public final void KWHzl(android.widget.TextView textView, java.lang.String str, java.lang.String str2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.append((java.lang.CharSequence) "\n");
        spannableStringBuilder.append((java.lang.CharSequence) str2);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), str.length() + 1, str.length() + str2.length() + 1, 17);
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), str.length() + 1, str.length() + str2.length() + 1, 17);
        textView.setText(spannableStringBuilder);
    }
}
