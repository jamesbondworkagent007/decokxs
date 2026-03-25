package com.okinc.business.market.features.favorites.editing.ui.dialog;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesEditGroupNameBottomSheet;
import com.okinc.business.market.features.favorites.editing.ui.viewmodel.MarketFavoritesGroupViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C26170jUn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jTS;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavoritesAddCryptosToGroupBottomSheet$showCreateGroupDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesAddCryptosToGroupBottomSheet$showCreateGroupDialog$1(jTS jts, Continuation<? super MarketFavoritesAddCryptosToGroupBottomSheet$showCreateGroupDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = jts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavoritesAddCryptosToGroupBottomSheet$showCreateGroupDialog$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavoritesAddCryptosToGroupBottomSheet$showCreateGroupDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.favorites.editing.ui.dialog.MarketFavoritesAddCryptosToGroupBottomSheet$showCreateGroupDialog$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MarketFavoritesGroupViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ jTS this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jTS jts, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MarketFavoritesGroupViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ArrayList arrayList;
            ArrayList parcelableArrayList;
            String string;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL<Pair<List<C26170jUn>, List<C26170jUn>>> interfaceC49371unLKWHzl = ((MarketFavoritesGroupViewModel.StateListAnimator) this.L$0).KWHzl();
                InterfaceC49371unL.Activity activity = interfaceC49371unLKWHzl instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) interfaceC49371unLKWHzl : null;
                Pair pair = activity != null ? (Pair) activity.copydefault() : null;
                if (pair == null) {
                    arrayList = new ArrayList();
                } else {
                    List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) pair.getFirst(), (Iterable) pair.getSecond());
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
                    Iterator it = listDjBIcL.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C26170jUn) it.next()).copydefault());
                    }
                    arrayList = arrayList2;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayList = this.this$0.requireArguments().getParcelableArrayList("list", MarketFavoritesGroupPo.FavoritesPo.class);
                } else {
                    parcelableArrayList = this.this$0.requireArguments().getParcelableArrayList("list");
                }
                if (parcelableArrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : parcelableArrayList) {
                        if (obj2 instanceof MarketFavoritesGroupPo.FavoritesPo) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (!(!arrayList3.isEmpty())) {
                        arrayList3 = null;
                    }
                    if (arrayList3 != null) {
                        Bundle arguments = this.this$0.getArguments();
                        String string2 = arguments != null ? arguments.getString("groupId") : null;
                        Bundle arguments2 = this.this$0.getArguments();
                        if (arguments2 == null || (string = arguments2.getString("from")) == null) {
                            string = "";
                        }
                        FavoriteCrypotsInfo favoriteCrypotsInfo = new FavoriteCrypotsInfo(string2, arrayList3, string);
                        MarketFavoritesEditGroupNameBottomSheet.StateListAnimator stateListAnimator = MarketFavoritesEditGroupNameBottomSheet.Companion;
                        FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                        stateListAnimator.KWHzl(parentFragmentManager, (String) null, arrayList, favoriteCrypotsInfo);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jTS jts = this.this$0;
            MarketFavoritesGroupViewModel marketFavoritesGroupViewModelAYXKKw = jts.AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (jts.copydefault(marketFavoritesGroupViewModelAYXKKw, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
