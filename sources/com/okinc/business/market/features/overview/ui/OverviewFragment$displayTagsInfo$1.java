package com.okinc.business.market.features.overview.ui;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.overview.domain.BasicInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displayTagsInfo$1;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import com.okinc.business.market.features.token_detail.TokenDetail;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C21847hOn;
import o.C22622hio;
import o.C28988klE;
import o.C29069kmg;
import o.C29085kmw;
import o.C29706kyh;
import o.C56391yDq;
import o.C56442yFn;
import o.C59443zhD;
import o.hAO;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class OverviewFragment$displayTagsInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BasicInfo $basicInfo;
    final /* synthetic */ Overview $overviewData;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C28988klE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewFragment$displayTagsInfo$1(C28988klE c28988klE, BasicInfo basicInfo, Overview overview, Continuation<? super OverviewFragment$displayTagsInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = c28988klE;
        this.$basicInfo = basicInfo;
        this.$overviewData = overview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewFragment$displayTagsInfo$1(this.this$0, this.$basicInfo, this.$overviewData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewFragment$displayTagsInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        List<TagWrapper> listIsConnected;
        Iterator<T> it;
        Object next;
        TagWrapper tagWrapper;
        Object objEZpvd;
        List<TagWrapper> list;
        TagWrapper tagWrapper2;
        Iterator<T> it2;
        Object next2;
        TagWrapper tagWrapper3;
        Object objEZpvd2;
        List<TagWrapper> list2;
        TagWrapper tagWrapper4;
        TagWrapper tagWrapper5;
        Iterator<T> it3;
        Object next3;
        TagWrapper tagWrapper6;
        Object objEZpvd3;
        TagWrapper tagWrapper7;
        TagWrapper tagWrapper8;
        TagWrapper tagWrapper9;
        Iterator<T> it4;
        Object next4;
        TagWrapper tagWrapper10;
        Object objM7386unboximpl;
        TagWrapper tagWrapper11;
        TagWrapper tagWrapper12;
        TagWrapper tagWrapper13;
        TagWrapper tagWrapper14;
        Object objAEQbTJ;
        Object objEZpvd4;
        TagWrapper tagWrapper15;
        final TagWrapper tagWrapper16;
        TagWrapper tagWrapper17;
        TagWrapper tagWrapper18;
        TagWrapper tagWrapper19;
        Object objAEQbTJ2;
        TagWrapper tagWrapper20;
        TagWrapper tagWrapper21;
        TagWrapper tagWrapper22;
        TagWrapper tagWrapper23;
        TagWrapper tagWrapper24;
        Object objM7386unboximpl2;
        TagWrapper tagWrapper25;
        hAO haoEZpvd;
        hAO haoEZpvd2;
        C29069kmg c29069kmg;
        C29069kmg c29069kmg2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                TagViewModel tagViewModelFJNWhG = this.this$0.fJNWhG();
                LatestMarketInfoBean latestMarketInfoBeanDjBIcL = this.this$0.djBIcL();
                this.label = 1;
                objOLrzqt = tagViewModelFJNWhG.OLrzqt(latestMarketInfoBeanDjBIcL, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objOLrzqt)) {
                    objOLrzqt = null;
                }
                TokenDetail tokenDetail = (TokenDetail) objOLrzqt;
                listIsConnected = tokenDetail == null ? tokenDetail.isConnected() : null;
                if (listIsConnected == null) {
                    listIsConnected = yDY.AhwBna();
                }
                it = listIsConnected.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                    } else {
                        next = it.next();
                        if (C29706kyh.OLrzqt.EZpvd().contains(((TagWrapper) next).OLrzqt())) {
                        }
                    }
                }
                tagWrapper = (TagWrapper) next;
                if (tagWrapper == null) {
                    TagViewModel tagViewModelFJNWhG2 = this.this$0.fJNWhG();
                    this.L$0 = listIsConnected;
                    this.label = 2;
                    objEZpvd = tagViewModelFJNWhG2.EZpvd("dev", this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    if (Result.m7383isFailureimpl(objEZpvd)) {
                        objEZpvd = null;
                    }
                    tagWrapper = new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
                }
                list = listIsConnected;
                tagWrapper2 = tagWrapper;
                it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((TagWrapper) next2).OLrzqt(), (Object) "suspicious")) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                tagWrapper3 = (TagWrapper) next2;
                if (tagWrapper3 == null) {
                    TagViewModel tagViewModelFJNWhG3 = this.this$0.fJNWhG();
                    this.L$0 = list;
                    this.L$1 = tagWrapper2;
                    this.label = 3;
                    objEZpvd2 = tagViewModelFJNWhG3.EZpvd("suspicious", this);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    if (Result.m7383isFailureimpl(objEZpvd2)) {
                        objEZpvd2 = null;
                    }
                    tagWrapper3 = new TagWrapper(null, (TagMeta) objEZpvd2, 1, null);
                }
                list2 = list;
                tagWrapper4 = tagWrapper2;
                tagWrapper5 = tagWrapper3;
                it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = null;
                    } else {
                        next3 = it3.next();
                        if (Intrinsics.EZpvd((Object) ((TagWrapper) next3).OLrzqt(), (Object) "sniper")) {
                        }
                    }
                }
                tagWrapper6 = (TagWrapper) next3;
                if (tagWrapper6 == null) {
                    TagViewModel tagViewModelFJNWhG4 = this.this$0.fJNWhG();
                    this.L$0 = list2;
                    this.L$1 = tagWrapper4;
                    this.L$2 = tagWrapper5;
                    this.label = 4;
                    objEZpvd3 = tagViewModelFJNWhG4.EZpvd("sniper", this);
                    if (objEZpvd3 == objCopydefault) {
                        return objCopydefault;
                    }
                    if (Result.m7383isFailureimpl(objEZpvd3)) {
                        objEZpvd3 = null;
                    }
                    tagWrapper6 = new TagWrapper(null, (TagMeta) objEZpvd3, 1, null);
                }
                tagWrapper7 = tagWrapper4;
                tagWrapper8 = tagWrapper5;
                tagWrapper9 = tagWrapper6;
                it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next4 = it4.next();
                        if (C29706kyh.OLrzqt.copydefault().contains(((TagWrapper) next4).OLrzqt())) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                tagWrapper10 = (TagWrapper) next4;
                if (tagWrapper10 == null) {
                    TagViewModel tagViewModelFJNWhG5 = this.this$0.fJNWhG();
                    this.L$0 = tagWrapper7;
                    this.L$1 = tagWrapper8;
                    this.L$2 = tagWrapper9;
                    this.label = 5;
                    Object objEZpvd5 = tagViewModelFJNWhG5.EZpvd("smartMoney", this);
                    if (objEZpvd5 == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7386unboximpl = objEZpvd5;
                    tagWrapper11 = tagWrapper7;
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    tagWrapper10 = new TagWrapper(null, (TagMeta) objM7386unboximpl, 1, null);
                    tagWrapper7 = tagWrapper11;
                }
                tagWrapper12 = tagWrapper8;
                tagWrapper13 = tagWrapper9;
                tagWrapper14 = tagWrapper10;
                C28988klE c28988klE = this.this$0;
                String strCopydefault = this.$basicInfo.copydefault();
                String strKWHzl = this.$basicInfo.KWHzl();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.label = 6;
                objAEQbTJ = c28988klE.AEQbTJ(strCopydefault, strKWHzl, (Continuation<? super TagWrapper>) this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                TagWrapper tagWrapper26 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG6 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper26;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG6.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                    return objCopydefault;
                }
                TagWrapper tagWrapper27 = tagWrapper13;
                tagWrapper15 = tagWrapper14;
                tagWrapper16 = tagWrapper26;
                tagWrapper17 = tagWrapper7;
                tagWrapper18 = tagWrapper12;
                tagWrapper19 = tagWrapper27;
                if (Result.m7383isFailureimpl(objEZpvd4)) {
                    objEZpvd4 = null;
                }
                TagWrapper tagWrapper28 = new TagWrapper(null, (TagMeta) objEZpvd4, 1, null);
                TagViewModel tagViewModelFJNWhG7 = this.this$0.fJNWhG();
                Float fFIwbmz = C59443zhD.fIwbmz(this.$overviewData.EZpvd());
                this.L$0 = tagWrapper17;
                this.L$1 = tagWrapper18;
                this.L$2 = tagWrapper19;
                this.L$3 = tagWrapper15;
                this.L$4 = tagWrapper16;
                this.L$5 = tagWrapper28;
                this.label = 8;
                objAEQbTJ2 = tagViewModelFJNWhG7.AEQbTJ(fFIwbmz, this);
                if (objAEQbTJ2 != objCopydefault) {
                    return objCopydefault;
                }
                tagWrapper20 = tagWrapper15;
                tagWrapper21 = tagWrapper19;
                tagWrapper22 = tagWrapper18;
                tagWrapper23 = tagWrapper17;
                tagWrapper24 = tagWrapper28;
                objM7386unboximpl2 = objAEQbTJ2;
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                    objM7386unboximpl2 = null;
                }
                tagWrapper25 = (TagWrapper) objM7386unboximpl2;
                haoEZpvd = C28988klE.EZpvd(this.this$0);
                if (haoEZpvd != null && (c29069kmg2 = haoEZpvd.fetchVPNInfo) != null) {
                    c29069kmg2.setVisibility(0);
                }
                haoEZpvd2 = C28988klE.EZpvd(this.this$0);
                if (haoEZpvd2 != null && (c29069kmg = haoEZpvd2.fetchVPNInfo) != null) {
                    String strGEmmrt = this.$basicInfo.gEmmrt();
                    LatestMarketInfoBean latestMarketInfoBeanDjBIcL2 = this.this$0.djBIcL();
                    C29085kmw c29085kmw = new C29085kmw(strGEmmrt, tagWrapper24, tagWrapper23, tagWrapper22, tagWrapper21, tagWrapper25, tagWrapper16, tagWrapper20, latestMarketInfoBeanDjBIcL2 != null ? latestMarketInfoBeanDjBIcL2.getTop10HoldAmountPercentage() : null, this.$overviewData.copydefault(), this.$overviewData.gEmmrt(), null, null, null, 14336, null);
                    final C28988klE c28988klE2 = this.this$0;
                    Function1<? super Pair<Integer, Integer>, Unit> function1 = new Function1() { // from class: o.klS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$4(c28988klE2, (kotlin.Pair) obj2);
                        }
                    };
                    final C28988klE c28988klE3 = this.this$0;
                    Function0<Unit> function0 = new Function0() { // from class: o.klU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$5(c28988klE3, tagWrapper16);
                        }
                    };
                    final C28988klE c28988klE4 = this.this$0;
                    final Overview overview = this.$overviewData;
                    Function0<Unit> function02 = new Function0() { // from class: o.klR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$6(c28988klE4, overview);
                        }
                    };
                    final C28988klE c28988klE5 = this.this$0;
                    c29069kmg.setLabels(c29085kmw, function1, function0, function02, new Function1() { // from class: o.klT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$8(c28988klE5, (java.util.List) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objOLrzqt)) {
                }
                TokenDetail tokenDetail2 = (TokenDetail) objOLrzqt;
                if (tokenDetail2 == null) {
                }
                if (listIsConnected == null) {
                }
                it = listIsConnected.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                tagWrapper = (TagWrapper) next;
                if (tagWrapper == null) {
                }
                list = listIsConnected;
                tagWrapper2 = tagWrapper;
                it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                tagWrapper3 = (TagWrapper) next2;
                if (tagWrapper3 == null) {
                }
                list2 = list;
                tagWrapper4 = tagWrapper2;
                tagWrapper5 = tagWrapper3;
                it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                    }
                }
                tagWrapper6 = (TagWrapper) next3;
                if (tagWrapper6 == null) {
                }
                tagWrapper7 = tagWrapper4;
                tagWrapper8 = tagWrapper5;
                tagWrapper9 = tagWrapper6;
                it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                    }
                }
                tagWrapper10 = (TagWrapper) next4;
                if (tagWrapper10 == null) {
                }
                tagWrapper12 = tagWrapper8;
                tagWrapper13 = tagWrapper9;
                tagWrapper14 = tagWrapper10;
                C28988klE c28988klE6 = this.this$0;
                String strCopydefault2 = this.$basicInfo.copydefault();
                String strKWHzl2 = this.$basicInfo.KWHzl();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.label = 6;
                objAEQbTJ = c28988klE6.AEQbTJ(strCopydefault2, strKWHzl2, (Continuation<? super TagWrapper>) this);
                if (objAEQbTJ == objCopydefault) {
                }
                TagWrapper tagWrapper262 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG62 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper262;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG62.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                }
                break;
            case 2:
                listIsConnected = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                tagWrapper = new TagWrapper(null, (TagMeta) objEZpvd, 1, null);
                list = listIsConnected;
                tagWrapper2 = tagWrapper;
                it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                tagWrapper3 = (TagWrapper) next2;
                if (tagWrapper3 == null) {
                }
                list2 = list;
                tagWrapper4 = tagWrapper2;
                tagWrapper5 = tagWrapper3;
                it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                    }
                }
                tagWrapper6 = (TagWrapper) next3;
                if (tagWrapper6 == null) {
                }
                tagWrapper7 = tagWrapper4;
                tagWrapper8 = tagWrapper5;
                tagWrapper9 = tagWrapper6;
                it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                    }
                }
                tagWrapper10 = (TagWrapper) next4;
                if (tagWrapper10 == null) {
                }
                tagWrapper12 = tagWrapper8;
                tagWrapper13 = tagWrapper9;
                tagWrapper14 = tagWrapper10;
                C28988klE c28988klE62 = this.this$0;
                String strCopydefault22 = this.$basicInfo.copydefault();
                String strKWHzl22 = this.$basicInfo.KWHzl();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.label = 6;
                objAEQbTJ = c28988klE62.AEQbTJ(strCopydefault22, strKWHzl22, (Continuation<? super TagWrapper>) this);
                if (objAEQbTJ == objCopydefault) {
                }
                TagWrapper tagWrapper2622 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG622 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper2622;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG622.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                }
                break;
            case 3:
                tagWrapper2 = (TagWrapper) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd2)) {
                }
                tagWrapper3 = new TagWrapper(null, (TagMeta) objEZpvd2, 1, null);
                list2 = list;
                tagWrapper4 = tagWrapper2;
                tagWrapper5 = tagWrapper3;
                it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                    }
                }
                tagWrapper6 = (TagWrapper) next3;
                if (tagWrapper6 == null) {
                }
                tagWrapper7 = tagWrapper4;
                tagWrapper8 = tagWrapper5;
                tagWrapper9 = tagWrapper6;
                it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                    }
                }
                tagWrapper10 = (TagWrapper) next4;
                if (tagWrapper10 == null) {
                }
                tagWrapper12 = tagWrapper8;
                tagWrapper13 = tagWrapper9;
                tagWrapper14 = tagWrapper10;
                C28988klE c28988klE622 = this.this$0;
                String strCopydefault222 = this.$basicInfo.copydefault();
                String strKWHzl222 = this.$basicInfo.KWHzl();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.label = 6;
                objAEQbTJ = c28988klE622.AEQbTJ(strCopydefault222, strKWHzl222, (Continuation<? super TagWrapper>) this);
                if (objAEQbTJ == objCopydefault) {
                }
                TagWrapper tagWrapper26222 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG6222 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper26222;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG6222.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                }
                break;
            case 4:
                tagWrapper5 = (TagWrapper) this.L$2;
                tagWrapper4 = (TagWrapper) this.L$1;
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd3 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd3)) {
                }
                tagWrapper6 = new TagWrapper(null, (TagMeta) objEZpvd3, 1, null);
                tagWrapper7 = tagWrapper4;
                tagWrapper8 = tagWrapper5;
                tagWrapper9 = tagWrapper6;
                it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                    }
                }
                tagWrapper10 = (TagWrapper) next4;
                if (tagWrapper10 == null) {
                }
                tagWrapper12 = tagWrapper8;
                tagWrapper13 = tagWrapper9;
                tagWrapper14 = tagWrapper10;
                C28988klE c28988klE6222 = this.this$0;
                String strCopydefault2222 = this.$basicInfo.copydefault();
                String strKWHzl2222 = this.$basicInfo.KWHzl();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.label = 6;
                objAEQbTJ = c28988klE6222.AEQbTJ(strCopydefault2222, strKWHzl2222, (Continuation<? super TagWrapper>) this);
                if (objAEQbTJ == objCopydefault) {
                }
                TagWrapper tagWrapper262222 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG62222 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper262222;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG62222.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                }
                break;
            case 5:
                tagWrapper9 = (TagWrapper) this.L$2;
                tagWrapper8 = (TagWrapper) this.L$1;
                tagWrapper11 = (TagWrapper) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                tagWrapper10 = new TagWrapper(null, (TagMeta) objM7386unboximpl, 1, null);
                tagWrapper7 = tagWrapper11;
                tagWrapper12 = tagWrapper8;
                tagWrapper13 = tagWrapper9;
                tagWrapper14 = tagWrapper10;
                C28988klE c28988klE62222 = this.this$0;
                String strCopydefault22222 = this.$basicInfo.copydefault();
                String strKWHzl22222 = this.$basicInfo.KWHzl();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.label = 6;
                objAEQbTJ = c28988klE62222.AEQbTJ(strCopydefault22222, strKWHzl22222, (Continuation<? super TagWrapper>) this);
                if (objAEQbTJ == objCopydefault) {
                }
                TagWrapper tagWrapper2622222 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG622222 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper2622222;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG622222.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                }
                break;
            case 6:
                tagWrapper14 = (TagWrapper) this.L$3;
                tagWrapper13 = (TagWrapper) this.L$2;
                tagWrapper12 = (TagWrapper) this.L$1;
                tagWrapper7 = (TagWrapper) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                TagWrapper tagWrapper26222222 = (TagWrapper) objAEQbTJ;
                TagViewModel tagViewModelFJNWhG6222222 = this.this$0.fJNWhG();
                this.L$0 = tagWrapper7;
                this.L$1 = tagWrapper12;
                this.L$2 = tagWrapper13;
                this.L$3 = tagWrapper14;
                this.L$4 = tagWrapper26222222;
                this.label = 7;
                objEZpvd4 = tagViewModelFJNWhG6222222.EZpvd("topHolder", this);
                if (objEZpvd4 == objCopydefault) {
                }
                break;
            case 7:
                tagWrapper16 = (TagWrapper) this.L$4;
                tagWrapper15 = (TagWrapper) this.L$3;
                tagWrapper19 = (TagWrapper) this.L$2;
                tagWrapper18 = (TagWrapper) this.L$1;
                tagWrapper17 = (TagWrapper) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd4 = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objEZpvd4)) {
                }
                TagWrapper tagWrapper282 = new TagWrapper(null, (TagMeta) objEZpvd4, 1, null);
                TagViewModel tagViewModelFJNWhG72 = this.this$0.fJNWhG();
                Float fFIwbmz2 = C59443zhD.fIwbmz(this.$overviewData.EZpvd());
                this.L$0 = tagWrapper17;
                this.L$1 = tagWrapper18;
                this.L$2 = tagWrapper19;
                this.L$3 = tagWrapper15;
                this.L$4 = tagWrapper16;
                this.L$5 = tagWrapper282;
                this.label = 8;
                objAEQbTJ2 = tagViewModelFJNWhG72.AEQbTJ(fFIwbmz2, this);
                if (objAEQbTJ2 != objCopydefault) {
                }
                break;
            case 8:
                TagWrapper tagWrapper29 = (TagWrapper) this.L$5;
                tagWrapper16 = (TagWrapper) this.L$4;
                TagWrapper tagWrapper30 = (TagWrapper) this.L$3;
                TagWrapper tagWrapper31 = (TagWrapper) this.L$2;
                TagWrapper tagWrapper32 = (TagWrapper) this.L$1;
                TagWrapper tagWrapper33 = (TagWrapper) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                tagWrapper24 = tagWrapper29;
                tagWrapper20 = tagWrapper30;
                tagWrapper21 = tagWrapper31;
                tagWrapper22 = tagWrapper32;
                tagWrapper23 = tagWrapper33;
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                }
                tagWrapper25 = (TagWrapper) objM7386unboximpl2;
                haoEZpvd = C28988klE.EZpvd(this.this$0);
                if (haoEZpvd != null) {
                    c29069kmg2.setVisibility(0);
                }
                haoEZpvd2 = C28988klE.EZpvd(this.this$0);
                if (haoEZpvd2 != null) {
                    String strGEmmrt2 = this.$basicInfo.gEmmrt();
                    LatestMarketInfoBean latestMarketInfoBeanDjBIcL22 = this.this$0.djBIcL();
                    C29085kmw c29085kmw2 = new C29085kmw(strGEmmrt2, tagWrapper24, tagWrapper23, tagWrapper22, tagWrapper21, tagWrapper25, tagWrapper16, tagWrapper20, latestMarketInfoBeanDjBIcL22 != null ? latestMarketInfoBeanDjBIcL22.getTop10HoldAmountPercentage() : null, this.$overviewData.copydefault(), this.$overviewData.gEmmrt(), null, null, null, 14336, null);
                    final C28988klE c28988klE22 = this.this$0;
                    Function1<? super Pair<Integer, Integer>, Unit> function12 = new Function1() { // from class: o.klS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$4(c28988klE22, (kotlin.Pair) obj2);
                        }
                    };
                    final C28988klE c28988klE32 = this.this$0;
                    Function0<Unit> function03 = new Function0() { // from class: o.klU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$5(c28988klE32, tagWrapper16);
                        }
                    };
                    final C28988klE c28988klE42 = this.this$0;
                    final Overview overview2 = this.$overviewData;
                    Function0<Unit> function022 = new Function0() { // from class: o.klR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$6(c28988klE42, overview2);
                        }
                    };
                    final C28988klE c28988klE52 = this.this$0;
                    c29069kmg.setLabels(c29085kmw2, function12, function03, function022, new Function1() { // from class: o.klT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OverviewFragment$displayTagsInfo$1.invokeSuspend$lambda$8(c28988klE52, (java.util.List) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(C28988klE c28988klE, Pair pair) {
        c28988klE.gEmmrt().KWHzl(new C22622hio(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(C28988klE c28988klE, TagWrapper tagWrapper) {
        c28988klE.copydefault(tagWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(C28988klE c28988klE, Overview overview) {
        c28988klE.EZpvd(overview);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8(C28988klE c28988klE, List list) {
        c28988klE.DbNXlk();
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = c28988klE.AhwBna;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.INFO_LABEL_DEFINITION, CoinDetailTabType.INFO);
        }
        return Unit.INSTANCE;
    }
}
