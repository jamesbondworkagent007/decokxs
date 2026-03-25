package com.okinc.kline.ui.component.basic;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC39028pka;
import o.InterfaceC39039pkl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class BaseFragmentDataComponent implements InterfaceC39039pkl<AbstractC39028pka> {
    public AbstractC39028pka EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC39028pka abstractC39028pka) {
        Intrinsics.checkNotNullParameter(abstractC39028pka, "");
        this.EZpvd = abstractC39028pka;
    }

    public final AbstractC39028pka OLrzqt() {
        AbstractC39028pka abstractC39028pka = this.EZpvd;
        if (abstractC39028pka != null) {
            return abstractC39028pka;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public void KWHzl(@NotNull AbstractC39028pka abstractC39028pka) {
        Intrinsics.checkNotNullParameter(abstractC39028pka, "");
        copydefault(abstractC39028pka);
    }
}
