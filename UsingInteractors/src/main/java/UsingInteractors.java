
    private HashMap<String, GCompound> compoundlist;
    public void init() {
        addActionlisteners();
        addMouselisteners();
        add(name, SOUTH);
        add(field, SOUTH);
        add(addValue,SOUTH);
        add(removeValue,SOUTH);
        add(clearAll,SOUTH);
        compoundlist = new HashMap<String, GCompound>();
    }
    public void actionPerformed(ActionEvent e){
        object cmd=e.getSource();
        if(cmd==name||cmd==addValue){
            boxCompound(name.getText());
        }else if(cmd==removeValue){
            removeBox(name.getText());
        }else if(cmd==clearAll){
            clearEverything();
        }
    }
    public void boxCompound(String s) {
        GCcompound boxCommound = new GCompound();
        add(addValue, SOUTH);
        add(removeValue, SOUTH);
        add(clearAll, SOUTH);
        compoundlist = new HashMap<String, GCompound>();
    }
    public void actionPerformed(ActionEvent e) {
        object cmd = e.getSource();
        if (cmd == name || cmd == addValue) {
            boxCompound(name.getText());
        }else if(cmd==removeValue){
            removeBox(name.getText());
        }else if(cmd==clearAll){
            clearEverything();
        }
    }
    public void boxCompound(String s) {
        GCompound boxCompound = new GCompound();
        GRect boxOutline = new GRect(BOX_WIDTH, BOX_HEIGHT);
        GLabel boxLabel = new Glabel(s);
        boxCompound.add(boxOutline, -Box_WIDTH / 2, -Box_HEIGHT / 2);
        boxCompound.add(boxLabel, -boxlabel.getwidth() / 2, boxLabel.getAscent() / 2);
        add(boxCompound, getWidth() / 2, getHeigt() / 2);
        compoundlist.put(s, boxCompound);
    }
    private void removeBox(String name) {
        GCompound
