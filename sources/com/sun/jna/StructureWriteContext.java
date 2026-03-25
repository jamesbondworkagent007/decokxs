package com.sun.jna;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes12.dex */
public class StructureWriteContext extends ToNativeContext {
    private Field field;
    private Structure struct;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Field getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Structure getStructure() {
        return this.struct;
    }

    public StructureWriteContext(Structure structure, Field field) {
        this.struct = structure;
        this.field = field;
    }
}
