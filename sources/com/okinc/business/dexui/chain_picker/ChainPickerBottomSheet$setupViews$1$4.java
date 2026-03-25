package com.okinc.business.dexui.chain_picker;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C23407hxe;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ChainPickerBottomSheet$setupViews$1$4 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainPickerBottomSheet$setupViews$1$4(Object obj) {
        super(1, obj, C23407hxe.class, "onFilterByChainName", "onFilterByChainName(Ljava/lang/CharSequence;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        ((C23407hxe) this.receiver).AEQbTJ(charSequence);
    }
}
