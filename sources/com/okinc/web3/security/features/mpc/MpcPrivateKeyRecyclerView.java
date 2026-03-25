package com.okinc.web3.security.features.mpc;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.databinding.ItemMpcPrivateKeyHeaderBinding;
import com.okinc.web3.security.databinding.Web3SecurityLoadingLayoutBinding;
import com.okinc.web3.security.utils.LruCacheBitmapUtils;
import com.okinc.web3.security.utils.WrapApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C43316rmw;
import o.C43318rmy;
import o.C55326xho;
import o.C56392yDr;
import o.C56402yEa;
import o.C57407yho;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MpcPrivateKeyRecyclerView extends RecyclerView {
    public static final int $stable = 8;
    private final InterfaceC56387yDm mAdapter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpcPrivateKeyRecyclerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.mAdapter$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MpcPrivateKeyRecyclerView.mAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpcPrivateKeyRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.mAdapter$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MpcPrivateKeyRecyclerView.mAdapter_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpcPrivateKeyRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.mAdapter$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MpcPrivateKeyRecyclerView.mAdapter_delegate$lambda$0();
            }
        });
    }

    private final C43316rmw getMAdapter() {
        return (C43316rmw) this.mAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw mAdapter_delegate$lambda$0() {
        return new C43316rmw();
    }

    public final void initView() {
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        Intrinsics.copydefault(itemAnimator);
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        C43316rmw mAdapter = getMAdapter();
        final int i = C57407yho.StateListAnimator.fARcdN;
        mAdapter.register(Loading.class, new C43318rmy<Loading, Web3SecurityLoadingLayoutBinding>(i) { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView$initView$1$1
        });
        final int i2 = C57407yho.StateListAnimator.AuCTel;
        mAdapter.register(Header.class, new C43318rmy<Header, ItemMpcPrivateKeyHeaderBinding>(i2) { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView$initView$1$2
        });
        mAdapter.register(MpcPrivateKeyItem.class, new MpcPrivateKeyItemViewBinding(new LruCacheBitmapUtils(), new Function1() { // from class: com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MpcPrivateKeyRecyclerView.initView$lambda$2$lambda$1(this.f$0, ((Integer) obj).intValue());
            }
        }));
        setAdapter(mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$lambda$1(MpcPrivateKeyRecyclerView mpcPrivateKeyRecyclerView, int i) {
        mpcPrivateKeyRecyclerView.getMAdapter().notifyItemChanged(i);
        return Unit.INSTANCE;
    }

    public final void showLoading() {
        C33064mpR.OLrzqt(getMAdapter(), (List<? extends Object>) C56402yEa.EZpvd(Loading.INSTANCE));
    }

    public final void showPrivateKeyList(@NotNull List<MpcPrivateKeyItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        C43316rmw mAdapter = getMAdapter();
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(Header.INSTANCE);
        listOLrzqt.addAll(list);
        C33064mpR.OLrzqt(mAdapter, (List<? extends Object>) C56402yEa.fARcdN(listOLrzqt));
    }

    public final void copyAllPrivateKey(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        List<?> items = getMAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        ArrayList<MpcPrivateKeyItem> arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof MpcPrivateKeyItem) {
                arrayList.add(obj);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (MpcPrivateKeyItem mpcPrivateKeyItem : arrayList) {
            sb.append(mpcPrivateKeyItem.getChainName());
            sb.append(": \n");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            sb.append(WrapApi.dataUnwrap(context, mpcPrivateKeyItem.getPrivateKey()));
            sb.append("\n\n");
        }
        String string = sb.toString();
        if (C33129mqd.OLrzqt((CharSequence) string)) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C57407yho.Activity.AuCTelauCTel), 0, 1, (Object) null);
            Object systemService = getContext().getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, string));
            function0.invoke();
        }
    }
}
