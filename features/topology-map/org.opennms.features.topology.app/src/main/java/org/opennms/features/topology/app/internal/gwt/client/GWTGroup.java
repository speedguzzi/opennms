package org.opennms.features.topology.app.internal.gwt.client;


public final class GWTGroup extends GWTVertex {

    protected GWTGroup() {};
    
    public static GWTGroup create(String id, int x, int y) {
	    return GWTVertex.create(id, x, y).cast();
	}
}
