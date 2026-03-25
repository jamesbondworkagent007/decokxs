package com.tinder.scarlet.lifecycle;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C58072yuQ;
import o.InterfaceC58028ytZ;
import o.yBO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class FlowableLifecycle$combineWith$flowable$2 extends FunctionReferenceImpl implements Function1<List<? extends yBO<InterfaceC58028ytZ.StateListAnimator>>, InterfaceC58028ytZ.StateListAnimator> {
    public static final FlowableLifecycle$combineWith$flowable$2 INSTANCE = new FlowableLifecycle$combineWith$flowable$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FlowableLifecycle$combineWith$flowable$2() {
        super(1, C58072yuQ.class, "combine", "combine(Ljava/util/List;)Lcom/tinder/scarlet/Lifecycle$State;", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ InterfaceC58028ytZ.StateListAnimator invoke(List<? extends yBO<InterfaceC58028ytZ.StateListAnimator>> list) {
        return invoke2((List<yBO<InterfaceC58028ytZ.StateListAnimator>>) list);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final InterfaceC58028ytZ.StateListAnimator invoke2(@NotNull List<yBO<InterfaceC58028ytZ.StateListAnimator>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C58072yuQ.EZpvd(list);
    }
}
