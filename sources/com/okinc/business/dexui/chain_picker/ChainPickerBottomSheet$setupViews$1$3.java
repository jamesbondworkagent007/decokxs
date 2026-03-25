package com.okinc.business.dexui.chain_picker;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23407hxe;
import o.C55043xcW;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ChainPickerBottomSheet$setupViews$1$3 extends FunctionReferenceImpl implements Function2<C55043xcW, Object, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainPickerBottomSheet$setupViews$1$3(Object obj) {
        super(2, obj, C23407hxe.class, "renderItem", "renderItem(Lcom/okinc/uilab/list/AnchorSelectionViewHolder;Ljava/lang/Object;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C55043xcW c55043xcW, Object obj) {
        invoke2(c55043xcW, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C55043xcW c55043xcW, Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        ((C23407hxe) this.receiver).EZpvd(c55043xcW, obj);
    }
}
