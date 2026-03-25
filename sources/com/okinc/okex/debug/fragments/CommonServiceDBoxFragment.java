package com.okinc.okex.debug.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okex.common.navigator.CommonServiceKey;
import com.okinc.okex.debug.fragments.CommonServiceDBoxFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC45423spX;
import o.AbstractC47367toh;
import o.AbstractC52786wYh;
import o.C45300snG;
import o.C47315tni;
import o.C52794wYp;
import o.C55001xbh;
import o.C55018xby;
import o.C55276xgr;
import o.C55296xhK;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class CommonServiceDBoxFragment extends AbstractC45423spX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC47367toh AEQbTJ;

    @yCM
    public C45300snG csRegistry;
    public final String KWHzl = "CommonService Nav";
    public final int EZpvd = C47315tni.ActionBar.getFieldNames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int EZpvd(C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45451spz
    public String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Possible override for method o.spX.KWHzl()V */
    public final C45300snG KWHzl() {
        C45300snG c45300snG = this.csRegistry;
        if (c45300snG != null) {
            return c45300snG;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.debug.fragments.CommonServiceDBoxFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final CommonServiceDBoxFragment AEQbTJ() {
            return new CommonServiceDBoxFragment();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47367toh abstractC47367tohCopydefault = AbstractC47367toh.copydefault(layoutInflater, viewGroup, false);
        this.AEQbTJ = abstractC47367tohCopydefault;
        if (abstractC47367tohCopydefault != null) {
            return abstractC47367tohCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47367toh abstractC47367toh = this.AEQbTJ;
        if (abstractC47367toh != null) {
            CommonServiceKey[] commonServiceKeyArrValues = CommonServiceKey.values();
            ArrayList arrayList = new ArrayList(commonServiceKeyArrValues.length);
            for (CommonServiceKey commonServiceKey : commonServiceKeyArrValues) {
                arrayList.add(new C55276xgr(commonServiceKey.name(), commonServiceKey, null, false, false, null, null, 124, null));
            }
            List<C55276xgr> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
            C55018xby c55018xby = abstractC47367toh.AEQbTJ;
            c55018xby.setItems(listFJNWhG);
            final AbstractC52786wYh abstractC52786wYhOLrzqt = c55018xby.OLrzqt();
            if (abstractC52786wYhOLrzqt != null) {
                C55018xby.Activity activity = abstractC52786wYhOLrzqt instanceof C55018xby.Activity ? (C55018xby.Activity) abstractC52786wYhOLrzqt : null;
                if (activity != null) {
                    activity.EZpvd(new Function1() { // from class: o.spA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return CommonServiceDBoxFragment.EZpvd(abstractC52786wYhOLrzqt, (java.lang.CharSequence) obj);
                        }
                    });
                }
                C55276xgr c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.firstOrNull(listFJNWhG);
                if (c55276xgr != null) {
                    abstractC52786wYhOLrzqt.copydefault(c55276xgr, new Function1() { // from class: o.spD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Integer.valueOf(CommonServiceDBoxFragment.EZpvd((C55276xgr) obj));
                        }
                    });
                    c55276xgr.copydefault(true);
                }
            }
            C52794wYp c52794wYp = abstractC47367toh.EZpvd;
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, abstractC47367toh, this));
        }
        view.post(new Runnable() { // from class: o.spJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                CommonServiceDBoxFragment.OLrzqt(this.copydefault);
            }
        });
    }

    public static final Unit EZpvd(AbstractC52786wYh abstractC52786wYh, CharSequence charSequence) {
        abstractC52786wYh.dismiss();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(CommonServiceDBoxFragment commonServiceDBoxFragment) {
        rVN.reportFullyDrawn$default((Fragment) commonServiceDBoxFragment, true, (String) null, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ AbstractC47367toh AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ CommonServiceDBoxFragment OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, AbstractC47367toh abstractC47367toh, CommonServiceDBoxFragment commonServiceDBoxFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = abstractC47367toh;
            this.OLrzqt = commonServiceDBoxFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(View view) {
            String string;
            Editable text;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                for (C55276xgr c55276xgr : this.AEQbTJ.AEQbTJ.copydefault()) {
                    if (c55276xgr.AEQbTJ()) {
                        Object objOLrzqt = c55276xgr.OLrzqt();
                        Intrinsics.copydefault(objOLrzqt, "");
                        CommonServiceKey commonServiceKey = (CommonServiceKey) objOLrzqt;
                        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.KWHzl.AkhnZx();
                        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null) {
                            string = null;
                        } else {
                            if (!(!StringsKt__StringsKt.fARcdN(text))) {
                                text = null;
                            }
                            if (text != null) {
                                string = text.toString();
                            }
                        }
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new CommonServiceDBoxFragment$initView$1$2$1(this.OLrzqt, commonServiceKey, this.AEQbTJ, string, null), 3, null);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }
}
