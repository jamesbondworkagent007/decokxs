package com.okinc.im.imui.group.groupentry;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationFragment$setObserver$1$3;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryCurrency;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C33129mqd;
import o.C33934nLg;
import o.C34134nSr;
import o.C34141nSy;
import o.C35399nuc;
import o.C52761wXj;
import o.C52794wYp;
import o.C54819xWm;
import o.C55001xbh;
import o.C55018xby;
import o.C55052xcf;
import o.C55239xgG;
import o.C55276xgr;
import o.C55296xhK;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.nJF;
import o.oHT;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupEntryConfigurationFragment$setObserver$1$3 extends SuspendLambda implements yHO<CoroutineScope, GroupEntryConfigurationViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34141nSy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationFragment$setObserver$1$3(C34141nSy c34141nSy, Continuation<? super GroupEntryConfigurationFragment$setObserver$1$3> continuation) {
        super(3, continuation);
        this.this$0 = c34141nSy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupEntryConfigurationViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        GroupEntryConfigurationFragment$setObserver$1$3 groupEntryConfigurationFragment$setObserver$1$3 = new GroupEntryConfigurationFragment$setObserver$1$3(this.this$0, continuation);
        groupEntryConfigurationFragment$setObserver$1$3.L$0 = stateListAnimator;
        return groupEntryConfigurationFragment$setObserver$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean boolKWHzl;
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupEntryConfigurationViewModel.StateListAnimator stateListAnimator = (GroupEntryConfigurationViewModel.StateListAnimator) this.L$0;
            final GroupEntryAssetVerification groupEntryAssetVerificationCopydefault = stateListAnimator.copydefault();
            final GroupEntryConfigurationViewModel.Activity activityAEQbTJ = stateListAnimator.AEQbTJ();
            List<C55276xgr> listOLrzqt = stateListAnimator.OLrzqt();
            nJF njf = this.this$0.KWHzl;
            if (njf == null) {
                Intrinsics.gEmmrt("");
                njf = null;
            }
            C55018xby c55018xby = njf.fetchVPNInfo;
            C34141nSy c34141nSy = this.this$0;
            List<C55276xgr> listCopydefault = c55018xby.copydefault();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            Iterator<T> it = listCopydefault.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C55276xgr c55276xgr = (C55276xgr) it.next();
                Iterator<T> it2 = c34141nSy.OLrzqt().OLrzqt().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((GroupEntryConfigurationViewModel.ActionBar) next).AEQbTJ() == (activityAEQbTJ != null ? activityAEQbTJ.KWHzl() : null)) {
                        break;
                    }
                }
                GroupEntryConfigurationViewModel.ActionBar actionBar = (GroupEntryConfigurationViewModel.ActionBar) next;
                Integer numAEQbTJ = actionBar != null ? C56443yFo.AEQbTJ(actionBar.KWHzl()) : null;
                String string = numAEQbTJ != null ? c34141nSy.getString(numAEQbTJ.intValue()) : null;
                if (Intrinsics.EZpvd((Object) c55276xgr.AhwBna(), (Object) string)) {
                    c55276xgr.copydefault(true);
                    c55018xby.setText(string);
                }
                arrayList.add(c55276xgr);
            }
            c55018xby.setItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
            nJF njf2 = this.this$0.KWHzl;
            if (njf2 == null) {
                Intrinsics.gEmmrt("");
                njf2 = null;
            }
            final C55001xbh c55001xbh = njf2.gEmmrt;
            final C34141nSy c34141nSy2 = this.this$0;
            c55001xbh.setShowThousandsSeparator(true);
            c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.nSE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    GroupEntryConfigurationFragment$setObserver$1$3.invokeSuspend$lambda$6$lambda$5(c34141nSy2, activityAEQbTJ, c55001xbh, view, z);
                }
            });
            nJF njf3 = this.this$0.KWHzl;
            if (njf3 == null) {
                Intrinsics.gEmmrt("");
                njf3 = null;
            }
            C55239xgG c55239xgG = njf3.ejfBZ;
            final C34141nSy c34141nSy3 = this.this$0;
            c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.nSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    GroupEntryConfigurationFragment$setObserver$1$3.invokeSuspend$lambda$9(groupEntryAssetVerificationCopydefault, c34141nSy3, compoundButton, z);
                }
            });
            this.this$0.copydefault(activityAEQbTJ != null ? activityAEQbTJ.valueOf() : null, activityAEQbTJ != null ? activityAEQbTJ.djBIcL() : null, activityAEQbTJ != null ? activityAEQbTJ.EZpvd() : null, activityAEQbTJ != null ? activityAEQbTJ.AEQbTJ() : null);
            C33934nLg c33934nLg = this.this$0.EZpvd;
            if (c33934nLg == null) {
                Intrinsics.gEmmrt("");
                c33934nLg = null;
            }
            C55052xcf c55052xcf = c33934nLg.OLrzqt;
            C34141nSy c34141nSy4 = this.this$0;
            if (listOLrzqt != null) {
                listOLrzqt.size();
                boolKWHzl = C56443yFo.KWHzl(listOLrzqt.size() > 1);
            } else {
                boolKWHzl = null;
            }
            c55052xcf.copydefault().setText(activityAEQbTJ != null ? activityAEQbTJ.EZpvd() : null);
            if (listOLrzqt != null) {
                c55052xcf.EZpvd().setVisibility((boolKWHzl == null || !boolKWHzl.booleanValue()) ? 8 : 0);
            }
            c55052xcf.setOnClickListener(new StateListAnimator(c55052xcf, 1000L, boolKWHzl, c34141nSy4));
            C34134nSr c34134nSr = this.this$0.OLrzqt;
            final C34141nSy c34141nSy5 = this.this$0;
            if (listOLrzqt != null) {
                c34134nSr.AEQbTJ(listOLrzqt);
            }
            c34134nSr.AEQbTJ(new Function1() { // from class: o.nSF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return GroupEntryConfigurationFragment$setObserver$1$3.invokeSuspend$lambda$16$lambda$15(c34141nSy5, (GroupEntryCurrency) obj2);
                }
            });
            nJF njf4 = this.this$0.KWHzl;
            if (njf4 == null) {
                Intrinsics.gEmmrt("");
                njf4 = null;
            }
            C52794wYp c52794wYp = njf4.isConnected;
            final C34141nSy c34141nSy6 = this.this$0;
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.nSB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    GroupEntryConfigurationFragment$setObserver$1$3.invokeSuspend$lambda$18$lambda$17(c34141nSy6, activityAEQbTJ, view);
                }
            });
            C34141nSy c34141nSy7 = this.this$0;
            c34141nSy7.copydefault(c34141nSy7.OLrzqt().AEQbTJ(), activityAEQbTJ != null ? activityAEQbTJ.AEQbTJ() : null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Boolean AEQbTJ;
        public final /* synthetic */ C34141nSy EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, Boolean bool, C34141nSy c34141nSy) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = bool;
            this.EZpvd = c34141nSy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (Intrinsics.EZpvd(this.AEQbTJ, Boolean.TRUE)) {
                    FragmentManager fragmentManager = this.EZpvd.getFragmentManager();
                    if (fragmentManager == null) {
                        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                        Intrinsics.copydefault(activityAEQbTJ, "");
                        fragmentManager = ((FragmentActivity) activityAEQbTJ).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(fragmentManager, "");
                    }
                    this.EZpvd.OLrzqt.show(fragmentManager);
                }
                this.EZpvd.AEQbTJ(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$lambda$5(C34141nSy c34141nSy, GroupEntryConfigurationViewModel.Activity activity, C55001xbh c55001xbh, View view, boolean z) {
        Editable text;
        String strValueOf;
        String strCopydefault;
        nJF njf = null;
        if (z) {
            nJF njf2 = c34141nSy.KWHzl;
            if (njf2 == null) {
                Intrinsics.gEmmrt("");
                njf2 = null;
            }
            njf2.AkhnZx.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            nJF njf3 = c34141nSy.KWHzl;
            if (njf3 == null) {
                Intrinsics.gEmmrt("");
                njf3 = null;
            }
            njf3.KWHzl.setError(false);
            if (activity != null && ((text = c55001xbh.getText()) == null || StringsKt__StringsKt.fARcdN(text) || (((strValueOf = activity.valueOf()) == null || StringsKt__StringsKt.fARcdN((CharSequence) strValueOf)) && ((strCopydefault = activity.copydefault()) == null || StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault))))) {
                c55001xbh.setText(c34141nSy.AEQbTJ(C33129mqd.gEmmrt(activity.valueOf()), activity.AEQbTJ()));
            }
        } else {
            c55001xbh.setText(c34141nSy.AEQbTJ(c55001xbh.isConnected(), activity != null ? activity.AEQbTJ() : null));
        }
        nJF njf4 = c34141nSy.KWHzl;
        if (njf4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            njf = njf4;
        }
        njf.isConnected.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9(GroupEntryAssetVerification groupEntryAssetVerification, final C34141nSy c34141nSy, CompoundButton compoundButton, boolean z) {
        if (!z) {
            nJF njf = null;
            if ((groupEntryAssetVerification != null ? groupEntryAssetVerification.getAssetVerificationStatus() : null) == GroupEntryAssetsVerificationStatus.ENABLED) {
                nJF njf2 = c34141nSy.KWHzl;
                if (njf2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    njf = njf2;
                }
                njf.ejfBZ.setChecked(true);
                oHT.ActionBar actionBar = oHT.Companion;
                String string = c34141nSy.getString(C35399nuc.LoaderManager.ikEgkI);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = c34141nSy.getString(C35399nuc.LoaderManager.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                oHT ohtNewInstance$default = oHT.ActionBar.newInstance$default(actionBar, string, string2, null, 4, null);
                ohtNewInstance$default.copydefault(new Function0() { // from class: o.nSC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return GroupEntryConfigurationFragment$setObserver$1$3.invokeSuspend$lambda$9$lambda$8$lambda$7(c34141nSy);
                    }
                });
                FragmentManager parentFragmentManager = c34141nSy.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                ohtNewInstance$default.show(parentFragmentManager);
                return;
            }
        }
        c34141nSy.OLrzqt().OLrzqt(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$9$lambda$8$lambda$7(C34141nSy c34141nSy) {
        c34141nSy.OLrzqt().AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$16$lambda$15(C34141nSy c34141nSy, GroupEntryCurrency groupEntryCurrency) {
        c34141nSy.OLrzqt().KWHzl(groupEntryCurrency);
        c34141nSy.AEQbTJ(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$18$lambda$17(C34141nSy c34141nSy, GroupEntryConfigurationViewModel.Activity activity, View view) {
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModelOLrzqt = c34141nSy.OLrzqt();
        nJF njf = c34141nSy.KWHzl;
        if (njf == null) {
            Intrinsics.gEmmrt("");
            njf = null;
        }
        groupEntryConfigurationViewModelOLrzqt.AEQbTJ(njf.gEmmrt.isConnected());
        c34141nSy.AEQbTJ(false);
        GroupEntryConfigurationViewModel groupEntryConfigurationViewModelOLrzqt2 = c34141nSy.OLrzqt();
        GroupEntryAssetVerificationType groupEntryAssetVerificationTypeKWHzl = activity != null ? activity.KWHzl() : null;
        Integer numOLrzqt = activity != null ? activity.OLrzqt() : null;
        String strValueOf = activity != null ? activity.valueOf() : null;
        String strDjBIcL = activity != null ? activity.djBIcL() : null;
        nJF njf2 = c34141nSy.KWHzl;
        if (njf2 == null) {
            Intrinsics.gEmmrt("");
            njf2 = null;
        }
        groupEntryConfigurationViewModelOLrzqt2.AEQbTJ(groupEntryAssetVerificationTypeKWHzl, numOLrzqt, strValueOf, strDjBIcL, njf2.gEmmrt.isConnected(), activity != null ? activity.EZpvd() : null);
    }
}
