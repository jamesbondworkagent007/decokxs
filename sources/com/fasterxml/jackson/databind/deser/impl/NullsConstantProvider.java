package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;
import o.InterfaceC5555Wf;

/* JADX INFO: loaded from: classes21.dex */
public class NullsConstantProvider implements InterfaceC5555Wf, Serializable {
    private static final long serialVersionUID = 1;
    protected final AccessPattern _access;
    protected final Object _nullValue;
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    private static final NullsConstantProvider NULLER = new NullsConstantProvider(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isNuller(InterfaceC5555Wf interfaceC5555Wf) {
        return interfaceC5555Wf == NULLER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isSkipper(InterfaceC5555Wf interfaceC5555Wf) {
        return interfaceC5555Wf == SKIPPER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5555Wf
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }

    public NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? NULLER : new NullsConstantProvider(obj);
    }
}
