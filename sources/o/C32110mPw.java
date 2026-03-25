package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.net.HttpHeaders;
import com.okinc.components.track.ABTestManager;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC8041avJ;
import o.C31976mKx;
import o.mMH;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mPw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32110mPw extends RecyclerView {
    public TaskDescription EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32110mPw(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32110mPw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32110mPw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "FloatHttpRecyclerView";
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.EZpvd = new TaskDescription(context2);
        this.KWHzl = 200;
        EZpvd();
    }

    private final void EZpvd() {
        setLayoutManager(new LinearLayoutManager(getContext()));
        setAdapter(this.EZpvd);
        this.EZpvd.copydefault(new AbstractC8041avJ.Activity() { // from class: o.mPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC8041avJ.Activity
            public final void EZpvd(int i) {
                C32110mPw.EZpvd(this.OLrzqt, i);
            }
        });
    }

    public static final void EZpvd(C32110mPw c32110mPw, int i) {
        java.util.Map mapGEmmrt;
        try {
            pUU.EZpvd(c32110mPw.OLrzqt, c32110mPw.EZpvd.AEQbTJ(i).gEmmrt.encodedPath() + "onclick");
            mMQ mmqAEQbTJ = c32110mPw.EZpvd.AEQbTJ(i);
            android.content.Intent intent = new android.content.Intent(c32110mPw.getContext(), (java.lang.Class<?>) mMH.class);
            if (ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, new mMH.Activity(), null, 2, null)) {
                mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("path", mmqAEQbTJ.gEmmrt.url().getFile()), C56390yDp.OLrzqt("url", mmqAEQbTJ.gEmmrt.url()), C56390yDp.OLrzqt("Request Body", mmqAEQbTJ.AEQbTJ), C56390yDp.OLrzqt("Status Code", mmqAEQbTJ.EZpvd), C56390yDp.OLrzqt("Method", mmqAEQbTJ.KWHzl), C56390yDp.OLrzqt(HttpHeaders.RTT, mmqAEQbTJ.AYXKKw));
            } else {
                mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("path", mmqAEQbTJ.gEmmrt.url().getFile()), C56390yDp.OLrzqt("Request Body", mmqAEQbTJ.AEQbTJ), C56390yDp.OLrzqt("Status Code", mmqAEQbTJ.EZpvd), C56390yDp.OLrzqt("Method", mmqAEQbTJ.KWHzl), C56390yDp.OLrzqt(HttpHeaders.RTT, mmqAEQbTJ.AYXKKw));
            }
            intent.putExtra("reqBody", mmqAEQbTJ.AEQbTJ);
            intent.putExtra("info", C33490mxT.OLrzqt(mapGEmmrt));
            java.lang.String str = mmqAEQbTJ.OLrzqt;
            if (str != null) {
                SPUtils.put("requestBody", str);
            }
            intent.putExtra("requestHeaders", C33490mxT.OLrzqt(mmqAEQbTJ.djBIcL.toMultimap()));
            Headers headers = mmqAEQbTJ.AhwBna;
            if (headers != null) {
                intent.putExtra("responseHeaders", C33490mxT.OLrzqt(headers.toMultimap()));
            }
            intent.addFlags(268435456);
            c32110mPw.getContext().startActivity(intent);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.String> OLrzqt() {
        java.lang.String str;
        java.util.List<mMQ> listAEQbTJ = this.EZpvd.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(listAEQbTJ, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (mMQ mmq : listAEQbTJ) {
            java.lang.String str2 = mmq.OLrzqt;
            if (str2 != null) {
                Intrinsics.copydefault((java.lang.Object) str2);
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "\"_cIsFromCache\":true", false, 2, (java.lang.Object) null)) {
                    str = mmq.KWHzl + "\tcache\t" + mmq.EZpvd + "\t" + mmq.AYXKKw + "\t" + mmq.gEmmrt.encodedPath();
                } else {
                    str = mmq.KWHzl + "\t" + mmq.EZpvd + "\t" + mmq.AYXKKw + "\t" + mmq.gEmmrt.encodedPath();
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.mPw$TaskDescription */
    public static final class TaskDescription extends AbstractC8041avJ<mMQ> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new C0880TaskDescription(this, viewGroup);
        }

        /* JADX INFO: renamed from: o.mPw$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final class C0880TaskDescription extends AbstractC8033avB<mMQ> {
            public android.widget.TextView AEQbTJ;
            public android.widget.TextView AhwBna;
            public final /* synthetic */ TaskDescription EZpvd;
            public android.widget.TextView KWHzl;
            public android.widget.TextView OLrzqt;
            public android.widget.TextView copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0880TaskDescription(@NotNull TaskDescription taskDescription, android.view.ViewGroup viewGroup) {
                super(viewGroup, C31976mKx.Application.AubY);
                Intrinsics.checkNotNullParameter(viewGroup, "");
                this.EZpvd = taskDescription;
                android.view.View viewAEQbTJ = AEQbTJ(C31976mKx.Activity.DaRZkR);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
                this.OLrzqt = (android.widget.TextView) viewAEQbTJ;
                android.view.View viewAEQbTJ2 = AEQbTJ(C31976mKx.Activity.call);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ2, "");
                this.AEQbTJ = (android.widget.TextView) viewAEQbTJ2;
                android.view.View viewAEQbTJ3 = AEQbTJ(C31976mKx.Activity.QXDzTk);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ3, "");
                this.AhwBna = (android.widget.TextView) viewAEQbTJ3;
                android.view.View viewAEQbTJ4 = AEQbTJ(C31976mKx.Activity.DGgnkA);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ4, "");
                this.KWHzl = (android.widget.TextView) viewAEQbTJ4;
                android.view.View viewAEQbTJ5 = AEQbTJ(C31976mKx.Activity.hCLrkq);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ5, "");
                this.copydefault = (android.widget.TextView) viewAEQbTJ5;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
            @Override // o.AbstractC8033avB
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void OLrzqt(@NotNull mMQ mmq) {
                int i;
                Intrinsics.checkNotNullParameter(mmq, "");
                super.OLrzqt(mmq);
                if (mmq.OLrzqt() != null) {
                    java.lang.String strOLrzqt = mmq.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                    if (StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strOLrzqt).toString() != null) {
                        java.lang.String strEncodedPath = mmq.gEmmrt.encodedPath();
                        java.lang.String strOLrzqt2 = mmq.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
                        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strEncodedPath, (java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strOLrzqt2).toString(), false, 2, (java.lang.Object) null)) {
                            this.itemView.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                            android.content.Context context = this.itemView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            layoutParams.height = C33052mpF.EZpvd(30.0f, context);
                            this.itemView.setLayoutParams(layoutParams);
                        } else {
                            this.itemView.setVisibility(8);
                            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
                            layoutParams2.height = 0;
                            this.itemView.setLayoutParams(layoutParams2);
                        }
                    } else {
                        this.itemView.setVisibility(0);
                        ViewGroup.LayoutParams layoutParams3 = this.itemView.getLayoutParams();
                        android.content.Context context2 = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        layoutParams3.height = C33052mpF.EZpvd(30.0f, context2);
                        this.itemView.setLayoutParams(layoutParams3);
                    }
                }
                this.OLrzqt.setText(mmq.KWHzl.toString());
                if (!Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getText(), (java.lang.Object) "GET")) {
                    this.OLrzqt.setBackgroundResource(C31976mKx.ActionBar.OLrzqt);
                } else {
                    this.OLrzqt.setBackgroundResource(C31976mKx.ActionBar.copydefault);
                }
                this.AEQbTJ.setText(mmq.EZpvd);
                if (!Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.getText(), (java.lang.Object) "200")) {
                    this.AEQbTJ.setBackgroundResource(C31976mKx.ActionBar.valueOf);
                } else {
                    this.AEQbTJ.setBackgroundResource(C31976mKx.ActionBar.EZpvd);
                }
                this.AhwBna.setText(mmq.AYXKKw);
                this.KWHzl.setText(mmq.gEmmrt.encodedPath());
                android.widget.TextView textView = this.copydefault;
                java.lang.String str = mmq.OLrzqt;
                if (str != null) {
                    Intrinsics.copydefault((java.lang.Object) str);
                    i = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "\"_cIsFromCache\":true", false, 2, (java.lang.Object) null) ? 0 : 8;
                }
                textView.setVisibility(i);
            }
        }
    }

    public final void KWHzl(@NotNull mMQ mmq, java.lang.String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(mmq, "");
            this.EZpvd.EZpvd(mmq);
            while (this.EZpvd.EZpvd() >= this.KWHzl) {
                this.EZpvd.copydefault(0);
            }
            this.EZpvd.notifyDataSetChanged();
            if (!canScrollVertically(1)) {
                smoothScrollToPosition(this.EZpvd.EZpvd());
            }
        }
    }

    public final void KWHzl() {
        this.EZpvd.OLrzqt();
    }

    public final void setFilterText(java.lang.String str) {
        java.util.List<mMQ> listAEQbTJ = this.EZpvd.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(listAEQbTJ, "");
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            ((mMQ) it.next()).KWHzl((str == null || str.length() == 0) ? "" : str);
        }
        this.EZpvd.notifyDataSetChanged();
    }
}
